package timetable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Informations {
	ArrayList<Students> listStudents = new ArrayList<Students>();
	ArrayList<Professor> listProfessors = new ArrayList<Professor>();
	ArrayList<Times> listTimes = new ArrayList<>();
	ArrayList<Room> listRoom = new ArrayList<Room>();

	public void createStudent() {
		// Create students
		Students student1 = new Students(0, "Student1");
		Students student2 = new Students(1, "Student2");
		Students student3 = new Students(2, "Student3");
		Students student4 = new Students(3, "Student4");

		// Create list of students
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
	}

	public void createProfessor() {
		// Create Professor
		Professor pro1 = new Professor(0, "Professor1");
		Professor pro2 = new Professor(1, "Professor2");

		// Create list of professor
		listProfessors.add(pro1);
		listProfessors.add(pro2);
	}

	public void createTime() throws ParseException {
		// Create times
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd.MM.yyyy hh:mm:ss a");

		Date startRoom1 = simpleDateFormat.parse("Thu 08.03.2017 08:00:00 AM");
		Date endRoom1 = simpleDateFormat.parse("Thu 08.03.2017 11:00:00 AM");
		Times timeRoom1 = new Times(0, startRoom1, endRoom1);

		Date startRoom2 = simpleDateFormat.parse("Sat 11.03.2017 06:00:00 PM");
		Date endRoom2 = simpleDateFormat.parse("Sat 11.03.2017 09:00:00 PM");
		Times timeRoom2 = new Times(0, startRoom2, endRoom2);

		// Create list of times
		listTimes.add(timeRoom1);
		listTimes.add(timeRoom2);
	}

	public void crateRoom() {
		// Create rooms
		Room room1 = new Room(0);
		Room room2 = new Room(1);
		Room room3 = new Room(2);

		// Create list of rooms
		listRoom.add(room1);
		listRoom.add(room2);
		listRoom.add(room3);
	}
}