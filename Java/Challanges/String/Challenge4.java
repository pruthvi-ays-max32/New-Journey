package String;

// Q : Create an object with final fields and a constructor to initialize them. 
// This class is immutable because after construction running we can't change the values of anything class because everything is final.

public class Challenge4 {

  final String name;
  final int age;
  final String besti;

  public Challenge4(String name, int age, String besti) {
    this.name = name;
    this.age = age;
    this.besti = besti;
  }

  public String toString(){
    return "Akanksha [ name : " + name + ", age : " + age + ", bestii : " + besti + " ]"; 
  }

  public static void main(String[] args) {
    Challenge4 Akanksha = new Challenge4("Akanksha", 22, "Pruthvi");
    System.out.println(Akanksha);
  }
}
