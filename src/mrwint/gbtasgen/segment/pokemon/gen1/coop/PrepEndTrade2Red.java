package mrwint.gbtasgen.segment.pokemon.gen1.coop;

import static mrwint.gbtasgen.move.Move.A;
import static mrwint.gbtasgen.move.Move.B;
import static mrwint.gbtasgen.move.Move.DOWN;
import static mrwint.gbtasgen.move.Move.LEFT;
import static mrwint.gbtasgen.move.Move.RIGHT;
import static mrwint.gbtasgen.move.Move.SELECT;
import static mrwint.gbtasgen.move.Move.START;
import static mrwint.gbtasgen.move.Move.UP;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.AERODACTYL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.AGILITY;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.ARBOK;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.BELLSPROUT;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.CHARIZARD;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.CLOYSTER;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.DEWGONG;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.DRAGONAIR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.EKANS;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.ELECTABUZZ;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.ESCAPE_ROPE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.EXEGGCUTE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.EXEGGUTOR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.FARFETCHD;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.FISSURE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GEODUDE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GLOOM;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GOLBAT;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GOLDEEN;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GOLDUCK;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GRIMER;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GROWL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GROWLITHE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.GYARADOS;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.HITMONCHAN;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.HM03;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.HM04;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.HORSEA;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.IVYSAUR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.KABUTO;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.KINGLER;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.KOFFING;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.KRABBY;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.LEAF_STONE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.LEER;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.LICKITUNG;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MACHOKE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MAGIKARP;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MAGMAR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MAGNEMITE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MANKEY;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MEWTWO;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MOON_STONE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.MUK;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.NIDOKING;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.NIDOQUEEN;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.NIDORINA;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.NIDORINO;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.OMANYTE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.OMASTAR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PIDGEOT;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PIDGEOTTO;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PIDGEY;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PIKACHU;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PINSIR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.POISON_STING;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.POLIWAG;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.POLIWHIRL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.POLIWRATH;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PONYTA;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PORYGON;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PRIMEAPE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.PSYDUCK;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.RAICHU;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.RARE_CANDY;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.RATTATA;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.ROAR;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SANDSHREW;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SANDSLASH;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SCYTHER;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SEADRA;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SEAKING;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SEEL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SHELLDER;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SLOWBRO;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.SLOWPOKE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.STARMIE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.STARYU;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.TACKLE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.TAIL_WHIP;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.TANGELA;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.TENTACOOL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.TENTACRUEL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.THUNDER_STONE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.VICTREEBEL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.VILEPLUME;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.VOLTORB;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.WARTORTLE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.WATER_STONE;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.WEEPINBELL;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.WEEZING;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.WHIRLWIND;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.X_SPEED;
import static mrwint.gbtasgen.segment.pokemon.gen1.common.Constants.ZAPDOS;
import static mrwint.gbtasgen.util.EflUtil.PressMetric.MENU;
import static mrwint.gbtasgen.util.EflUtil.PressMetric.PRESSED;

import java.util.Collections;

import com.sun.org.apache.xpath.internal.operations.Equals;

import mrwint.gbtasgen.metric.Metric;
import mrwint.gbtasgen.metric.comparator.Comparator;
import mrwint.gbtasgen.metric.pokemon.CheckEncounterMetric;
import mrwint.gbtasgen.metric.pokemon.CheckFissureMisses;
import mrwint.gbtasgen.metric.pokemon.gen1.CheckLowerStatEffectMisses;
import mrwint.gbtasgen.metric.pokemon.gen1.CheckNoAIMoveNew;
import mrwint.gbtasgen.metric.pokemon.gen1.CheckSwitchAndTeleportEffectUsed;
import mrwint.gbtasgen.metric.pokemon.gen1.Gen1CheckDVMetric;
import mrwint.gbtasgen.metric.pokemon.gen1.OutputBoxMons;
import mrwint.gbtasgen.metric.pokemon.gen1.OutputDaycareMon;
import mrwint.gbtasgen.metric.pokemon.gen1.OutputItems;
import mrwint.gbtasgen.metric.pokemon.gen1.OutputParty;
import mrwint.gbtasgen.move.Move;
import mrwint.gbtasgen.move.pokemon.gen1.EflOverworldInteract;
import mrwint.gbtasgen.move.pokemon.gen1.EflWalkStep;
import mrwint.gbtasgen.segment.Segment;
import mrwint.gbtasgen.segment.pokemon.EflCatchMonSegment;
import mrwint.gbtasgen.segment.pokemon.EflEvolutionSegment;
import mrwint.gbtasgen.segment.pokemon.EflLearnTMSegment;
import mrwint.gbtasgen.segment.pokemon.EflOverrideMoveSegment;
import mrwint.gbtasgen.segment.pokemon.EflTextSegment;
import mrwint.gbtasgen.segment.pokemon.EflWalkToSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflCheckMoveOrderMetric;
import mrwint.gbtasgen.segment.pokemon.fight.EflEndFightSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflHitMetricSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflInitFightSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflKillEnemyMonSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflKillEnemyMonSegment.EflEnemyMoveDesc;
import mrwint.gbtasgen.segment.pokemon.fight.EflNewEnemyMonSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflSwitchPokemonSegment;
import mrwint.gbtasgen.segment.pokemon.fight.EflUseBattleItemSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.Constants;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflBuyItemSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflCancelMoveLearnSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflChangeMonBoxSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflDepositMonSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflEncounterSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflFishSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflReleaseMonSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflSelectItemSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflSelectMonSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflSellItemSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflUseBikeSegment;
import mrwint.gbtasgen.segment.pokemon.gen1.common.EflWithdrawMonSegment;
import mrwint.gbtasgen.segment.util.EflSkipTextsSegment;
import mrwint.gbtasgen.segment.util.SeqSegment;
import mrwint.gbtasgen.segment.util.SkipTextsSegment;
import mrwint.gbtasgen.state.StateBuffer;
import mrwint.gbtasgen.util.EflUtil.PressMetric;

public class PrepEndTrade2Red extends SeqSegment {

	@Override
	public void execute() {
    seqEflButton(Move.A); // continue game
    seqEflButton(Move.START);
    seqEflButton(Move.A);
    seqEflButton(Move.START);
    seqEflButton(Move.A);

    seqMetric(new OutputParty());

	  {
      seq(new EflWalkToSegment(13, 4)); // PC
      seq(new EflWalkToSegment(13, 3, false)); // PC

      {
        seqEflButton(A); // use PC
        seq(new EflSkipTextsSegment(1)); // turned on
        seqEflButton(A); // someone's PC
        seq(new EflSkipTextsSegment(2)); // accessed, mon storage
        seq(new EflDepositMonSegment(STARMIE));
        seq(new EflWithdrawMonSegment(SHELLDER));
        seq(new EflDepositMonSegment(CHARIZARD));
        seq(new EflDepositMonSegment(PIDGEOT));
        seq(new EflDepositMonSegment(PRIMEAPE));
        seq(new EflWithdrawMonSegment(HITMONCHAN));
        seq(new EflWithdrawMonSegment(GLOOM));
        seq(new EflWithdrawMonSegment(MACHOKE));
        seq(new EflChangeMonBoxSegment(4)); // box 5
        seq(new EflDepositMonSegment(SHELLDER));
        seq(new EflDepositMonSegment(PORYGON));
        seq(new EflDepositMonSegment(MEWTWO));
        seq(new EflWithdrawMonSegment(ZAPDOS));
        seq(new EflWithdrawMonSegment(ELECTABUZZ));
        seq(new EflWithdrawMonSegment(VOLTORB));
//        seq(new EflWithdrawMonSegment(MAGNEMITE));
        seqEflButton(B, MENU); // cancel
        seqEflButton(B, PRESSED); // cancel
      }
      seqMetric(new OutputBoxMons());
      seqMetric(new OutputItems());

      seqEflSkipInput(1);
//      seq(new EflSelectItemSegment(WATER_STONE).andUse());
//      seq(new EflSelectMonSegment(SHELLDER));
//      seq(new EflEvolutionSegment()); // Cloyster
//      seqEflSkipInput(0);
      seq(new EflSelectItemSegment(LEAF_STONE).fromOverworld().andUse());
      seq(new EflSelectMonSegment(GLOOM));
      seq(new EflEvolutionSegment()); // Vileplume
      seqEflButton(B); // cancel
      seqEflButton(START); // cancel
//      seqEflSkipInput(1);
//      {
//        seqEflButton(A); // use PC
//        seq(new EflSkipTextsSegment(1)); // turned on
//        seqEflButton(A); // someone's PC
//        seq(new EflSkipTextsSegment(2)); // accessed, mon storage
////        seq(new EflChangeMonBoxSegment(4)); // box 5
//        seq(new EflDepositMonSegment(VILEPLUME));
////        seq(new EflDepositMonSegment(POLIWRATH));
//        seq(new EflWithdrawMonSegment(LICKITUNG));
////        seq(new EflWithdrawMonSegment(MAGNEMITE));
//        seqEflButton(B, MENU); // cancel
//        seqEflButton(B, PRESSED); // cancel
//      }

      seq(new EflWalkToSegment(11, 4)); // trade
      seq(new EflWalkToSegment(11, 3)); // trade

      seqMetric(new OutputParty());
	  }
  }
}
