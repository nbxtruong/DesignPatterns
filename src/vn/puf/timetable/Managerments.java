package vn.puf.timetable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Managerments {
	List<Timetable> timetables = new ArrayList<Timetable>();

	public void createTimetable() throws ParseException {
		Informations informations = new Informations();
		informations.createStudent();
		informations.createProfessor();
		informations.crateRoom();
		informations.createTime();

		// Create timetables
		Timetable o1 = new Timetable(1, informations.listProfessors.get(0).getId(),
				informations.listRoom.get(0).getId(), informations.listStudents,
				informations.listTimes.get(0).getStartDates(), informations.listTimes.get(0).getEndDates());

		// Create list of timetables
		timetables.add(o1);

		// Print timetables
		for (int i = 0; i < timetables.size(); i++) {
			System.out.println(timetables.get(i));
		}
	}

	public void checkTime(Date start, Date end) {
		for (int i = 0; i < timetables.size(); i++) {
			for (int y = 1; y <= timetables.size(); y++) {
				if (start == timetables.get(i).getStartDates() && end == timetables.get(y).getEndDates()) {
					System.out.println("2 ngay nay khong duoc.");
				} else {
					System.out.println("2 ngay nay duoc.");
				}
			}
		}
	}

	public static void main(String[] args) throws ParseException {
		Managerments mgms = new Managerments();

		// Show timetables
		mgms.createTimetable();

		// Dates checking
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd.MM.yyyy hh:mm:ss a");
		Date start = simpleDateFormat.parse("Thu 08.04.2017 08:00:00 AM");
		Date end = simpleDateFormat.parse("Thu 08.04.2017 08:30:00 AM");
		mgms.checkTime(start, end);
	}
}