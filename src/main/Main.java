package main;

import soldier.*;
import decorator.*;
import proxy.*;
import composite.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier horsement;
		Soldier infantrymen;

		int ncoups;
		boolean vHorsement = true;
		boolean vInfantrymen = true;

		// Default
		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		for (; (vInfantrymen = infantrymen.wardOff(horsement.hit()))
				&& (vHorsement = horsement.wardOff(infantrymen.hit())); ncoups++)
			;

		System.out.println("Death of the " + (vInfantrymen ? "Horsemen" : "Infantrymen") + " in " + ncoups + " shots");

		// Decorator
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

		// Proxy
		ncoups = 1;
		HorsemenWithShields proxyHorShields = new HorsemenWithShields(10, 20, 100);
		InfantrymenWithShields proxyInfanShields = new InfantrymenWithShields(15, 15, 100);

		for (; (vInfantrymen = proxyInfanShields.wardOff(proxyHorShields.hit()))
				&& (vHorsement = proxyHorShields.wardOff(proxyInfanShields.hit())); ncoups++)
			;
		System.out.println("Death of the " + (vInfantrymen ? "Horsemen With Swords" : "Infantrymen With Swords")
				+ " in " + ncoups + " shots");

		// Composite
		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		Army compositeArmy = new Army();
		compositeArmy.addCompositeSoldier(horsement);
		compositeArmy.addCompositeSoldier(infantrymen);

		for (; (vInfantrymen = compositeArmy.getListSoldier().get(0)
				.wardOff(compositeArmy.getListSoldier().get(1).hit()))
				&& (vHorsement = compositeArmy.getListSoldier().get(1)
						.wardOff(compositeArmy.getListSoldier().get(0).hit())); ncoups++)
			;
		System.out.println("Death of the " + (vInfantrymen ? "Horsemen With Swords" : "Infantrymen With Swords")
				+ " in " + ncoups + " shots");
	}

}