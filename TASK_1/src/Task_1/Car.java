package Task_1;
import java.util.*;
//1. Encapsulation and Inheritance
//Base class representing a generic Car
class Car {
 private static final String ENGINE_STARTED = "Engine started for ";
 private static final String CHARGING_BATTERY = "Charging battery for ";
 
 private String make; // Make of the car (e.g.Toyota)
 private String model; // Model of the car (e.g.Camry)
 private int year; // Manufacturing year of the car

 // Constructor to initialize car properties
 public Car(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 // Getter and Setter methods for car properties
 public String getMake() {
     return make;
 }

 public void setMake(String make) {
     this.make = make;
 }

 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }

 // Method to simulate starting the engine
 public void startEngine() {
     System.out.println(ENGINE_STARTED + make + " " + model);
 }
}
