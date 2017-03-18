package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteSubject implements Subject {
	double d;
	List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update();
		}
	}

	public void operation() {
		Random rand = new Random();
		d = rand.nextDouble();
		if (d < 0.25 || d > 0.75) {
			System.out.print("YES");
			notifyObservers();
		} else {
			System.out.print("NO");
		}
	}
}