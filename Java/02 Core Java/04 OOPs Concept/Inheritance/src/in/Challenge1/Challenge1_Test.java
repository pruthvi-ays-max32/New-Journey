/*
 Q: Start with a base class Libraryltem, that includes common attributes like itemlD, title, and
	author, and methods like checkout() and returnltem(). Create subclasses such as Book, Magazine,
	and DVD, each inheriting frery!ibcaryltem. Add unique attributes to each subclass, like ISBN 
	for Book, issueNumber for Magazine, and duration for DVD.
 */

package in.Challenge1;

public class Challenge1_Test {

	public static void main(String[] args) {
		LibraryItem lb = new LibraryItem();
		lb.checkout();
		lb.returnItem();
		
		Book bk = new Book();
		bk.checkout();
		bk.returnItem();
		bk.setISBN(800);
		System.out.println(bk.getISBN());
		bk.setAuthor("Ramanand");
		System.out.println(bk.getAuthor());
		
		Magzine mg = new Magzine();
		mg.checkout();
		mg.returnItem();
		mg.setIssueNumber(90);
		System.out.println(mg.getIssueNumber());
		mg.setItemId("23F");
		System.out.println(mg.getItemId());
		
		DVD dv = new DVD();
		dv.checkout();
		dv.returnItem();
		dv.setDuration(400);
		System.out.println("Duration of DVD is " + dv.getDuration() + " seconds.");

	}

}
