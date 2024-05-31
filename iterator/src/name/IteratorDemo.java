package name;

public class IteratorDemo {
	 public static void main(String[] args) {
		 System.out.println("Sameeksha Gupta 22BCP343");
		 NameRepository namesRepository = new NameRepository();
		 for(Iterator iter = namesRepository.getIterator(); 
		 iter.hasNext();){
		 String name = (String)iter.next();
		 System.out.println("Name : " + name);
		 }
	 }
}