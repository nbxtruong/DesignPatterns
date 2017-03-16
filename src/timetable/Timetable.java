package timetable;

import java.util.Date;
import java.util.List;

public class Timetable {
	private int id, professorID, romID;
	private List<Students> listStudents;
	private Date startDates, endDates;

	public Timetable(int id, int professorID, int romID, List<Students> listStudents, Date startDates, Date endDates) {
		super();
		this.id = id;
		this.professorID = professorID;
		this.romID = romID;
		this.listStudents = listStudents;
		this.startDates = startDates;
		this.endDates = endDates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProfessorID() {
		return professorID;
	}

	public void setProfessorID(int professorID) {
		this.professorID = professorID;
	}

	public int getRomID() {
		return romID;
	}

	public void setRomID(int romID) {
		this.romID = romID;
	}

	public List<Students> getListStudents() {
		return listStudents;
	}

	public void setListStudents(List<Students> listStudents) {
		this.listStudents = listStudents;
	}

	public Date getStartDates() {
		return startDates;
	}

	public void setStartDates(Date startDates) {
		this.startDates = startDates;
	}

	public Date getEndDates() {
		return endDates;
	}

	public void setEndDates(Date endDates) {
		this.endDates = endDates;
	}

	@Override
	public String toString() {
		return "Timetable [id=" + id + ", professorID=" + professorID + ", romID=" + romID + ", listStudents="
				+ listStudents + ", startDates=" + startDates + ", endDates=" + endDates + "]";
	}
}