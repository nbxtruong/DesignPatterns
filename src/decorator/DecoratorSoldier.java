package decorator;

import soldier.Soldier;

abstract class DecoratorSoldier implements Soldier {
	protected Soldier soldier;

	public DecoratorSoldier(Soldier soldier) {
		this.soldier = soldier;
	}

	public Soldier getSoldier() {
		return soldier;
	}

	public void setSoldier(Soldier soldier) {
		this.soldier = soldier;
	}
}
