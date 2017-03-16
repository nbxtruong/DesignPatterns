package vn.puf.game.proxy;

public class HorsemenWithShields extends ProxySoldier {
	protected int shields, strong;

	public HorsemenWithShields(int strong, int shields, int vie) {
		super();
		this.shields = shields;
		this.strong = strong;
		super.soldier = new Horsemen(vie);
	}

	@Override
	public int hit() {
		// TODO Auto-generated method stub
		return soldier.hit() + strong;
	}

	@Override
	public boolean wardOff(int force) {
		// TODO Auto-generated method stub
		if (force > shields) {
			force = force - shields;
			shields = 0;
		} else {
			shields = shields - force;
			force = 0;
		}
		return soldier.wardOff(force);
	}

}
