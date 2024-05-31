package youtube;
import java.util.*;
public class Channel implements Subject {
	
	private List<Subscriber> subs = new ArrayList<Subscriber>();
	public String title;
	
	@Override
	public void unsubscribe(Observer sub) {
		subs.remove(sub);
	}

	@Override
	public void notifySubscriber() {
		for(Observer sub: subs) {
			sub.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title=title;
		notifySubscriber();
	}

	@Override
	public void subscribe(Subscriber sub) {
		subs.add(sub);
	}

}
