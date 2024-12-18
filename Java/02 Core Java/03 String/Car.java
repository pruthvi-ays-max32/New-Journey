
/*
    toString() -> It used to provide String representation of an Object.
              -> this method returns "className@HashCode" as a default output.
                  -> so we need  to override the toString method in our class.
              -> It is inherited from Object Class.

              -> can be created using various methods like stringBuilder , StringBuffer, concatenation etc.
*/

public class Car {

  int noOfWheels;
  int noOfDoors;
  int maxSpeed;
  String color;
  String name;
  String compnay;

  // Constructor of Car Class.

  public Car(int noOfWheels, int noOfDoors, int maxSpeed, String color, String name, String compnay) {
    this.noOfWheels = noOfWheels;
    this.noOfDoors = noOfDoors;
    this.maxSpeed = maxSpeed;
    this.color = color;
    this.name = name;
    this.compnay = compnay;
  }

  // We need to override the toString method to define how the output we wanna achieve.

  @Override
  public String toString() {
    return "Car [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", color="
        + color + ", name=" + name + ", compnay=" + compnay + "]";
  }



  public static void main(String[] args) {
    Car creta = new Car(4, 4, 300, "black", "Creta", "Huyndai");
    System.out.println(creta);
  }

}