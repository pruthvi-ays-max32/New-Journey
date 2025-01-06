package in.equals;

public class EqualsAndHashCodeTest {
	public static void main(String args[]) {
		Person p1 = new Person("Pruthvi", "Bond007", 21);
		Person p2 = new Person("Pruthvi", "Bond007", 21);
		
		// equals give false here but we have to override the equals method for object.
		System.out.println(p1.equals(p2));
		// here we need to override the equals method in class which we are using for creating object. then only it will give true.
		System.out.println(p1 == p2);
		
	}
}
