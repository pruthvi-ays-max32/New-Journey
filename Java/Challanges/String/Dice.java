package String;

// Q : Simulate a dice roll using Math.random() and display the outcome (1 to 6).


public class Dice {

  public static int Roll(){
        double currRoll = Math.random() * 6;
        int roll = (int) Math.ceil(currRoll);
        return roll;
  }
  public static void main(String[] args) {
    for(int i=0; i<100; i++){
      System.out.println(Roll()); 
    } 
  }
}
