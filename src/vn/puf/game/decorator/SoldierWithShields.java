package vn.puf.game.decorator;

public class SoldierWithShields extends DecoratorSoldier {
	private int shields;

	public SoldierWithShields(Soldier soldier, int shields) {
		super(soldier);
		// TODO Auto-generated constructor stub
		this.shields = shields;
	}

	@Override
	public int hit() {
		// TODO Auto-generated method stub
		return soldier.hit();
	}

	@Override
	public boolean wardOff(int force) {
		// TODO Auto-generated method stub
		force = (force > shields) ? force - shields : shields - force;
		return soldier.wardOff(force);
	}
}
