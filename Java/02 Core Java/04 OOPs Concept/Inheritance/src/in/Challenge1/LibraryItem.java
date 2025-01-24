package in.Challenge1;

public class LibraryItem {
	private String itemId;
	private String author;
	private String title;
	
	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void checkout() {
		System.out.println("Person Checkout ..");
	}
	
	public void returnItem() {
		System.out.println("Item Returned ...");
	}
}
