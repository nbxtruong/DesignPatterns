package main;

import soldier.*;
import decorator.*;
import observer.ConcreteObserver;
import observer.ConcreteSubject;
import observer.Observer;
import proxy.*;
import composite.*;
import visitor.*;

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

		System.out.println(
				"(Default)Death of the " + (vInfantrymen ? "Horsemen" : "Infantrymen") + " in " + ncoups + " shots");

		// Decorator
		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		SoldierWithShields horsemenShields = new SoldierWithShields(horsement, 10);
		SoldierWithShields infantrymenShields = new SoldierWithShields(infantrymen, 10);

		for (; (vInfantrymen = infantrymenShields.wardOff(horsemenShields.hit()))
				&& (vHorsement = horsemenShields.wardOff(infantrymenShields.hit())); ncoups++)
			;
		System.out.println("(Decorator)Death of the "
				+ (vInfantrymen ? "Horsemen With Shields" : "Infantrymen With Shields") + " in " + ncoups + " shots");

		ncoups = 1;
		horsement = new Horsemen(50);
		infantrymen = new Infantrymen(50);
		SoldierWithSwords horsemenSwords = new SoldierWithSwords(horsement, 10);
		SoldierWithSwords infantrymenSwords = new SoldierWithSwords(infantrymen, 10);

		for (; (vInfantrymen = infantrymenSwords.wardOff(horsemenSwords.hit()))
				&& (vHorsement = horsemenSwords.wardOff(infantrymenSwords.hit())); ncoups++)
			;
		System.out.println("(Decorator)Death of the "
				+ (vInfantrymen ? "Horsemen With Swords" : "Infantrymen With Swords") + " in " + ncoups + " shots");

		// Proxy
		ncoups = 1;
		HorsemenWithShields proxyHorShields = new HorsemenWithShields(10, 20, 100);
		InfantrymenWithShields proxyInfanShields = new InfantrymenWithShields(15, 15, 100);

		for (; (vInfantrymen = proxyInfanShields.wardOff(proxyHorShields.hit()))
				&& (vHorsement = proxyHorShields.wardOff(proxyInfanShields.hit())); ncoups++)
			;
		System.out.println("(Proxy)Death of the " + (vInfantrymen ? "Horsemen With Swords" : "Infantrymen With Swords")
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
		System.out.println("(Composite)Death of the "
				+ (vInfantrymen ? "Horsemen With Swords" : "Infantrymen With Swords") + " in " + ncoups + " shots");

		// Visitor
		Horsemen hors = new Horsemen(50);
		Infantrymen infan = new Infantrymen(50);
		Infantrymen infan2 = new Infantrymen(50);

		ArmyCounter armyCounter = new ArmyCounter();
		armyCounter.visit(hors);
		armyCounter.visit(infan);
		armyCounter.visit(infan2);
		System.out.println("(Visitor)" + armyCounter.toString());

		ArmyDisplay armyDisplay = new ArmyDisplay();
		armyDisplay.visit(hors);
		armyDisplay.visit(infan);

		// observer
		System.out.println("... Demo Observer Pattern ...");
	    ConcreteSubject subject = new ConcreteSubject();
	    Observer ob1 = new ConcreteObserver(subject);
	    Observer ob2 = new ConcreteObserver(subject);
	    System.out.println("Doing something in the subject over time ...");
	    System.out.println("           Observable  Observer1      Observer2");
	    System.out.println("Iteration  change?     notified?      notified?");
	    for (int i = 0; i < 10; i++) {
	        System.out.print(i + ":         ");
	        subject.operation();
	        System.out.println();
	    }
	    System.out.println("Removing observer1 from the subject ... Repeating ...");
	    System.out.println("           Observable  Observer2");
	    System.out.println("Iteration  change?     notified?");
	    subject.deleteObserver(ob1);
	    for (int i = 0; i < 10; i++) {
	        System.out.print(i + ":         ");
	        subject.operation();
	        System.out.println();
	    }
	}

}