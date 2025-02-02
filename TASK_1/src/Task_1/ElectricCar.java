package Task_1;
//1. Encapsulation and Inheritance
//Subclass representing an ElectricCar with additional battery range property
class ElectricCar extends Car {
 private int batteryRange; // Battery range in miles or kilometers

 // Constructor to initialize electric car properties including battery range
 public ElectricCar(String make, String model, int year, int batteryRange) {
     super(make, model, year); // Call the base class constructor
     this.batteryRange = batteryRange;
 }

 // Method to simulate charging the battery
 public void chargeBattery() {
     System.out.println(CHARGING_BATTERY + getMake() + " " + getModel());
 }
}
