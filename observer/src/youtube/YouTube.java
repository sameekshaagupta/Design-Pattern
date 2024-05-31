package youtube;

public class YouTube {
	public static void main(String args[]) {
		System.out.println("Sameeksha Gupta\n22BCP343");
		Channel Design=new Channel();
	
		Subscriber s1=new Subscriber ("Ram");
		Subscriber s2=new Subscriber ("Hari");
		Subscriber s3=new Subscriber ("Sonam");
		Subscriber s4=new Subscriber ("Kiran");
		Subscriber s5=new Subscriber ("Ali");
		
		Design.subscribe(s1);
		Design.subscribe(s2);
		Design.subscribe(s3);
		Design.subscribe(s4);
		Design.subscribe(s5);
		
		s1.subscribeChannel (Design);
		s2.subscribeChannel (Design);
		s3.subscribeChannel (Design);
		s4.subscribeChannel (Design);
		s5.subscribeChannel (Design);
		
		Design.upload("Observer Design Pattern");
		
		Design.unsubscribe(s3);
		
		Design.upload ("DBMS");
	}
}
