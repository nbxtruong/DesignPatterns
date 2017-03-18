package visitor;

import soldier.Horsemen;
import soldier.Infantrymen;

public class ArmyCounter implements VisitorSoldier {
	protected int horCounter = 0, infanCounter = 0;

	@Override
	public void visit(Horsemen horsemen) {
		// TODO Auto-generated method stub
		horCounter++;
	}

	@Override
	public void visit(Infantrymen infantrymen) {
		// TODO Auto-generated method stub
		infanCounter++;
	}

	@Override
	public String toString() {
		return "ArmyCounter [horCounter=" + horCounter + ", infanCounter=" + infanCounter + "]";
	}
}