package player;

public class StatePatternDemo {
	 public static void main(String[] args) {
	 System.out.println("Sameeksha Gupta\n22BCP343");
	 Context context = new Context();
	 StartState startState = new StartState();
	 startState.doAction(context);
	 System.out.println(context.getState().toString());
	 StopState stopState = new StopState();
	 stopState.doAction(context);
	 System.out.println(context.getState().toString());
	 }
}