package vn.puf.timetable;

public class Room {
	private int id;

	public Room(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + "]";
	}
}