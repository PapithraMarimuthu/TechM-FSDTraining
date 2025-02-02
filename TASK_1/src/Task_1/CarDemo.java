package Task_1;
//2. Polymorphism Demonstration
class CarDemo {
 public static void main(String[] args) {
     // Creating an array of Car objects, including both a regular car and an electric car
     Car[] cars = {
         new Car("Toyota", "Camry", 2020),
         new ElectricCar("Tesla", "Model 3", 2022, 350)
     };
     
     // Demonstrating polymorphism: calling the startEngine() method on each car object
     for (Car car : cars) {
         car.startEngine(); // Polymorphism: different behavior for different types of cars
     }
 }
}
