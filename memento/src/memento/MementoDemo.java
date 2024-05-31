package memento;

public class MementoDemo {
	public static void main(String[] args) {
		   
	      Originator originator = new Originator();
	      CareTaker careTaker = new CareTaker();
	      System.out.println("Sameeksha Gupta 22BCP343");
	      originator.setState("State #1");
	      originator.setState("State #2");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #4");
	      System.out.println("Current State: " + originator.getState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	   }
}
