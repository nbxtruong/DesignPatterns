package composite;

import soldier.Soldier;

public class Army extends CompositeSoldier {
	protected int totalDams = 0;
	protected boolean check = false;

	@Override
	public int hit() {
		// TODO Auto-generated method stub
		for (Soldier s : listSoldier) {
			totalDams += s.hit();
		}
		return totalDams;
	}

	@Override
	public boolean wardOff(int force) {
		// TODO Auto-generated method stub
		for (Soldier s : listSoldier) {
			if (s.wardOff(force / listSoldier.size()) == true) {
				check = true;
			}
		}
		return check;
	}
}