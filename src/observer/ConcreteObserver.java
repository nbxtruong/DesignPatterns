package observer;

public class ConcreteObserver implements Observer {
	private ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject) {
		this.subject = subject;
		this.subject.addObserver(ConcreteObserver.this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(subject.d);
	}

}
