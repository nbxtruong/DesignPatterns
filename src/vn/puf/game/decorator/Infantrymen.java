package vn.puf.game.decorator;

public class Infantrymen extends AbstractSoldier {
	private static final int FORCE_INFANTRYMEN = 1;

	Infantrymen(int vie) {
		super(vie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hit() {
		// TODO Auto-generated method stub
		return FORCE_INFANTRYMEN;
	}

}
