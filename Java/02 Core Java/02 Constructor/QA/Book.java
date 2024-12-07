/*
  Problem 1 : Create a Book class for a library system.
                -  Instance variables: title, author, isbn.
                -  Static variable: totalBooks, a counter for the total number of book instances.
                -  Instance methods: borrowBook(), returnBook().
                -  Static method: getTotalBooks(), to get the total number of books in the library.
 */

public class Book {
  String title;
  String author;
  int bookId;

  Book( String title, String author, int bookId){
      this.author = author;
      this.title = title;
      this.bookId = bookId;
  }

  static int totalBooks = 10;

  public void borrowBook(int bookId){
      System.out.println("borrowed Book of Id " + bookId );
      totalBooks--;
      getTotalBooks();
  }

  public void returnBook(){
    System.out.println("Returned Book.");
      totalBooks++;
      getTotalBooks();
  }

  public static void getTotalBooks(){
    System.out.println("Total Books Remaining in Book house is : " + totalBooks);
  }


  public static void main(String[] args) {
    // Book obj = new Book();
    // obj.borrowBook();
    // obj.returnBook();
    Book person1 = new Book("Atomic Habit", "Steave Smith", 76);
    person1.borrowBook(person1.bookId);
  }

}
