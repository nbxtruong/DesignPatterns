package timetable;

import java.util.Date;

public class Times {
	private int id;
	private Date startDates, endDates;

	public Times(int id, Date startDates, Date endDates) {
		super();
		this.id = id;
		this.startDates = startDates;
		this.endDates = endDates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Times [id=" + id + ", startDates=" + startDates + ", endDates=" + endDates + "]";
	}
}