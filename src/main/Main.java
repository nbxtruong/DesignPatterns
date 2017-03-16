package main;

import decorator.SoldierWithShields;
import decorator.SoldierWithSwords;
import soldier.Horsemen;
import soldier.Infantrymen;
import soldier.Soldier;

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

		////////
		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		SoldierWithShields horsemenShields = new SoldierWithShields(horsement, 10);
		SoldierWithShields infantrymenShields = new SoldierWithShields(infantrymen, 10);

		for (; (vInfantrymen = infantrymenShields.wardOff(horsemenShields.hit()))
				&& (vHorsement = horsemenShields.wardOff(infantrymenShields.hit())); ncoups++)
			;
		System.out.println("Death of the " + (vInfantrymen ? "Horsemen With Shields" : "Infantrymen With Shields")
				+ " in " + ncoups + " shots");

		////////
		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		SoldierWithSwords horsemenSwords = new SoldierWithSwords(horsement, 10);
		SoldierWithSwords infantrymenSwords = new SoldierWithSwords(infantrymen, 10);

		for (; (vInfantrymen = infantrymenSwords.wardOff(horsemenSwords.hit()))
				&& (vHorsement = horsemenSwords.wardOff(infantrymenSwords.hit())); ncoups++)
			;
		System.out.println("Death of the " + (vInfantrymen ? "Horsemen With Swords" : "Infantrymen With Swords")
				+ " in " + ncoups + " shots");

	}

}