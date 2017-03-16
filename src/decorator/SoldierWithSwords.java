package decorator;

import soldier.Soldier;

public class SoldierWithSwords extends DecoratorSoldier {
	protected int strength;

	public SoldierWithSwords(Soldier soldier, int strength) {
		super(soldier);
		// TODO Auto-generated constructor stub
		this.strength = strength;
	}

	@Override
	public int hit() {
		// TODO Auto-generated method stub
		return soldier.hit() + strength;
	}

	@Override
	public boolean wardOff(int force) {
		// TODO Auto-generated method stub
		return soldier.wardOff(force);
	}

}