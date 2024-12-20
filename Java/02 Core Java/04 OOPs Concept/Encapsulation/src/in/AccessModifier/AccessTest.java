package in.AccessModifier;

public class AccessTest {
    public static void main(String[] args) {
      PublicCar swift = new PublicCar();
      swift.color = "red";
      swift.model = "Creta";
      swift.name = "Huyndai";

      // we can't set value of fuel_level & costOfPurchase like this bcz it is private for that class.
      // swift.fuel_Level = 56.4;
      PublicCar bmw = new PublicCar("BMW", "Red", "Benz", 15.6, 67000);
    }

}
