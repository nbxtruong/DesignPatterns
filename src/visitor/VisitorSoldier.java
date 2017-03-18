package visitor;

import soldier.Horsemen;
import soldier.Infantrymen;

public interface VisitorSoldier {
	public void visit (Horsemen horsemen);
	public void visit (Infantrymen infantrymen);
}
