package composite;

import java.util.ArrayList;
import java.util.List;
import soldier.Soldier;

abstract class CompositeSoldier implements Soldier {
	List<Soldier> listSoldier = new ArrayList<Soldier>();

	public void addCompositeSoldier(Soldier soldier) {
		if (listSoldier != null) {
			listSoldier.add(soldier);
		}
	}

	public List<Soldier> getListSoldier() {
		return listSoldier;
	}

	public void setListSoldier(List<Soldier> listSoldier) {
		this.listSoldier = listSoldier;
	}
}