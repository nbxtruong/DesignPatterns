package visitor;

import soldier.Horsemen;
import soldier.Infantrymen;

public class ArmyDisplay implements VisitorSoldier {

	@Override
	public void visit(Horsemen horsemen) {
		// TODO Auto-generated method stub
		System.out.println("(Visitor)This is horsmen.");
	}

	@Override
	public void visit(Infantrymen infantrymen) {
		// TODO Auto-generated method stub
		System.out.println("(Visitor)This is infantrymen.");
	}

}
