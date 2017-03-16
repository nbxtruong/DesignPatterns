package vn.puf.game.proxy;

import vn.puf.game.decorator.SoldierWithShields;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier horsement;
		Soldier infantrymen;

		int ncoups;
		boolean vHorsement = true;
		boolean vInfantrymen = true;

		////////
		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		for (; (vInfantrymen = infantrymen.wardOff(horsement.hit()))
				&& (vHorsement = horsement.wardOff(infantrymen.hit())); ncoups++)
			;

		System.out.println("Death of the " + (vInfantrymen ? "Horsemen" : "Infantrymen") + " in " + ncoups + " shots");

		//////
		ncoups = 1;
		HorsemenWithShields horsemenProxy = new HorsemenWithShields(15, 10, 100);
		InfantrymenWithShields infantrymenProxy = new InfantrymenWithShields(10, 15, 100);

		for (; (vInfantrymen = infantrymenProxy.wardOff(horsemenProxy.hit()))
				&& (vHorsement = horsemenProxy.wardOff(infantrymenProxy.hit())); ncoups++)
			;

		System.out.println("Death of the " + (vInfantrymen ? "Horsemen" : "Infantrymen") + " in " + ncoups + " shots");
	}

}