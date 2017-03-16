package vn.puf.game.decorator;

public class Horsemen extends AbstractSoldier {
	private static final int FORCE_HORSEMEN = 2;

	Horsemen(int vie) {
		super(vie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hit() {
		// TODO Auto-generated method stub
		return FORCE_HORSEMEN;
	}

}
