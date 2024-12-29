package _6objectOrientedProgramming;

// Abstract class
abstract class Vehicle {
    private String make;
    private String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Abstract methods
    public abstract String startEngine();
    public abstract String stopEngine();

    // Common method
    public String getDetails() {
        return make + " " + model;
    }
}

// Concrete class: Car
class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public String startEngine() {
        return "Starting the engine of the car: " + getDetails();
    }

    @Override
    public String stopEngine() {
        return "Stopping the engine of the car: " + getDetails();
    }
}

// Concrete class: Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    @Override
    public String startEngine() {
        return "Starting the engine of the motorcycle: " + getDetails();
    }

    @Override
    public String stopEngine() {
        return "Stopping the engine of the motorcycle: " + getDetails();
    }
}

// Example usage
public class _12vehicleAbstractClass {
    public static void main(String[] args) {
        // Create an instance of Car
        Vehicle myCar = new Car("Toyota", "Corolla");
        System.out.println(myCar.startEngine());  // Output: Starting the engine of the car: Toyota Corolla
        System.out.println(myCar.stopEngine());   // Output: Stopping the engine of the car: Toyota Corolla

        // Create an instance of Motorcycle
        Vehicle myBike = new Motorcycle("Yamaha", "R15");
        System.out.println(myBike.startEngine());  // Output: Starting the engine of the motorcycle: Yamaha R15
        System.out.println(myBike.stopEngine());   // Output: Stopping the engine of the motorcycle: Yamaha R15
    }
}

