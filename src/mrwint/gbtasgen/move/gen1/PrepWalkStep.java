package mrwint.gbtasgen.move.gen1;


public class PrepWalkStep extends WalkStep {

	public PrepWalkStep(int dir) {
		super(dir, false, false);
	}
	@Override
	public boolean doMove() {
		prepareMovement();
		return true;
	}
}
