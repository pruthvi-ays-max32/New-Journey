/*
  Q: Create a class Person with attributes name and age. Override equals to compare Person objects
     based on their attributes. Override hashCode() consistent with the definition of equals().
 */

package in.Challenge2;

public class Challenge2Test {

	public static void main(String[] args) {
		
		Person p1 = new Person("Kunal", 21);
		Person p2 = new Person("Kunal", 21);
		
		System.out.println(p1.equals(p2));
	}

}
