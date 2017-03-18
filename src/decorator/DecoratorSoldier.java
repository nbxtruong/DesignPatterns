package decorator;

import soldier.Soldier;

abstract class DecoratorSoldier implements Soldier {
	protected Soldier soldier;

	public DecoratorSoldier(Soldier soldier) {
		this.soldier = soldier;
	}
}
