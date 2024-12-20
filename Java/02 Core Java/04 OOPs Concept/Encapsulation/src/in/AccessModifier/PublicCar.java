package in.AccessModifier;

public class PublicCar {
  public String name;
  public String color;
  public String model;
  private double fuel_Level;
  private long costOfPurchase;
  

  // default constructor
  public PublicCar (){

  }

  // Parameterize constructor.
  public PublicCar(String name, String color, String model, double fuel_Level, long costOfPurchase) {
    this.name = name;
    this.color = color;
    this.model = model;
    this.fuel_Level = fuel_Level;
    this.costOfPurchase = costOfPurchase;
  }


}
