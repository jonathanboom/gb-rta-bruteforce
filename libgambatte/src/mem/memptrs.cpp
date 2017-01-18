//
//   Copyright (C) 2007-2010 by sinamas <sinamas at users.sourceforge.net>
//
//   This program is free software; you can redistribute it and/or modify
//   it under the terms of the GNU General Public License version 2 as
//   published by the Free Software Foundation.
//
//   This program is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU General Public License version 2 for more details.
//
//   You should have received a copy of the GNU General Public License
//   version 2 along with this program; if not, write to the
//   Free Software Foundation, Inc.,
//   51 Franklin St, Fifth Floor, Boston, MA  02110-1301, USA.
//

#include "memptrs.h"
#include <algorithm>
#include <cstring>

namespace gambatte {

MemPtrs::MemPtrs()
: rmem_()
, wmem_()
, romdata_()
, wramdata_()
, vrambankptr_(0)
, rsrambankptr_(0)
, wsrambankptr_(0)
, memchunk_(0)
, rambankdata_(0)
, wramdataend_(0)
, oamDmaSrc_(oam_dma_src_off)
, curRomBank(1)
{
}

MemPtrs::~MemPtrs() {
	delete []memchunk_;
}

void MemPtrs::reset(unsigned const rombanks, unsigned const rambanks, unsigned const wrambanks) {
        numRombanks = rombanks;
	delete []memchunk_;
	memchunk_size = 0x4000 + rombanks * 0x4000ul + 0x4000 + rambanks * 0x2000ul + wrambanks * 0x1000ul + 0x4000; 
	memchunk_ = new unsigned char[memchunk_size];

	//FIXME: Make this random.
	memset(memchunk_, 0, memchunk_size);

	romdata_[0] = romdata();
	rambankdata_ = romdata_[0] + rombanks * 0x4000ul + 0x4000;
	wramdata_[0] = rambankdata_ + rambanks * 0x2000ul;
	wramdataend_ = wramdata_[0] + wrambanks * 0x1000ul;

	std::memset(rdisabledRamw(), 0xFF, 0x2000);

	oamDmaSrc_ = oam_dma_src_off;
	rmem_[0x3] = rmem_[0x2] = rmem_[0x1] = rmem_[0x0] = romdata_[0];
	rmem_[0xC] = wmem_[0xC] = wramdata_[0] - 0xC000;
	rmem_[0xE] = wmem_[0xE] = wramdata_[0] - 0xE000;
	setRombank(1);
	setRambank(0, 0);
	setVrambank(0);
	setWrambank(1);
}

void MemPtrs::setRombank0(unsigned bank) {
	romdata_[0] = romdata() + bank * 0x4000ul;
	rmem_[0x3] = rmem_[0x2] = rmem_[0x1] = rmem_[0x0] = romdata_[0];
	disconnectOamDmaAreas();
}

void MemPtrs::setRombank(unsigned bank) {
        curRomBank = bank;
	romdata_[1] = romdata() + bank * 0x4000ul - 0x4000;
	rmem_[0x7] = rmem_[0x6] = rmem_[0x5] = rmem_[0x4] = romdata_[1];
	disconnectOamDmaAreas();
}

void MemPtrs::setRambank(unsigned const flags, unsigned const rambank) {
	unsigned char *srambankptr = 0;
	if (!(flags & rtc_en)) {
		srambankptr = rambankdata() != rambankdataend()
		            ? rambankdata_ + rambank * 0x2000ul - 0xA000
		            : wdisabledRam() - 0xA000;
	}

	rsrambankptr_ = (flags & read_en) && srambankptr != wdisabledRam() - 0xA000
	              ? srambankptr
	              : rdisabledRamw() - 0xA000;
	wsrambankptr_ = flags & write_en ? srambankptr : wdisabledRam() - 0xA000;
	rmem_[0xB] = rmem_[0xA] = rsrambankptr_;
	wmem_[0xB] = wmem_[0xA] = wsrambankptr_;
	disconnectOamDmaAreas();
}

void MemPtrs::setWrambank(unsigned bank) {
	wramdata_[1] = wramdata_[0] + (bank & 0x07 ? bank & 0x07 : 1) * 0x1000;
	rmem_[0xD] = wmem_[0xD] = wramdata_[1] - 0xD000;
	disconnectOamDmaAreas();
}

void MemPtrs::setOamDmaSrc(OamDmaSrc oamDmaSrc) {
	rmem_[0x3] = rmem_[0x2] = rmem_[0x1] = rmem_[0x0] = romdata_[0];
	rmem_[0x7] = rmem_[0x6] = rmem_[0x5] = rmem_[0x4] = romdata_[1];
	rmem_[0xB] = rmem_[0xA] = rsrambankptr_;
	wmem_[0xB] = wmem_[0xA] = wsrambankptr_;
	rmem_[0xC] = wmem_[0xC] = wramdata_[0] - 0xC000;
	rmem_[0xD] = wmem_[0xD] = wramdata_[1] - 0xD000;
	rmem_[0xE] = wmem_[0xE] = wramdata_[0] - 0xE000;

	oamDmaSrc_ = oamDmaSrc;
	disconnectOamDmaAreas();
}

void MemPtrs::disconnectOamDmaAreas() {
	if (isCgb(*this)) {
		switch (oamDmaSrc_) {
		case oam_dma_src_rom:  // fall through
		case oam_dma_src_sram:
		case oam_dma_src_invalid:
			std::fill(rmem_, rmem_ + 8, static_cast<unsigned char *>(0));
			rmem_[0xB] = rmem_[0xA] = 0;
			wmem_[0xB] = wmem_[0xA] = 0;
			break;
		case oam_dma_src_vram:
			break;
		case oam_dma_src_wram:
			rmem_[0xE] = rmem_[0xD] = rmem_[0xC] = 0;
			wmem_[0xE] = wmem_[0xD] = wmem_[0xC] = 0;
			break;
		case oam_dma_src_off:
			break;
		}
	} else {
		switch (oamDmaSrc_) {
		case oam_dma_src_rom:  // fall through
		case oam_dma_src_sram:
		case oam_dma_src_wram:
		case oam_dma_src_invalid:
			std::fill(rmem_, rmem_ + 8, static_cast<unsigned char *>(0));
			rmem_[0xB] = rmem_[0xA] = 0;
			wmem_[0xB] = wmem_[0xA] = 0;
			rmem_[0xE] = rmem_[0xD] = rmem_[0xC] = 0;
			wmem_[0xE] = wmem_[0xD] = wmem_[0xC] = 0;
			break;
		case oam_dma_src_vram:
			break;
		case oam_dma_src_off:
			break;
		}
	}
}

void MemPtrs::loadOrSave(loadsave& state)
{
	state(memchunk_, 0x4000);
	state(romdataend(), memchunk_size - (romdataend() - memchunk_));
	int oamDmaSrc_2 = oamDmaSrc_;
	state(oamDmaSrc_2);
	oamDmaSrc_ = (OamDmaSrc)oamDmaSrc_2;
	//Rmem is constant.
	for(unsigned i = 0; i < 0x10; i++)
		state(wmem_[i], memchunk_);
	for(unsigned i = 0; i < 0x10; i++)
		state(rmem_[i], memchunk_);
	state(romdata_[0], memchunk_);
	state(romdata_[1], memchunk_);
	state(rambankdata_, memchunk_);
	state(rsrambankptr_, memchunk_);
	state(wsrambankptr_, memchunk_);
	state(wramdataend_, memchunk_);
	state(vrambankptr_, memchunk_);
	//memchunk_size is cart constant, not saved.
}

}
