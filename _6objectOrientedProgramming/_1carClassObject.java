package _6objectOrientedProgramming;

public class _1carClassObject {
    String model;
    int year;
    String color;

    // Constructor to initialize the object
    public _1carClassObject(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }

    // Main method (entry point of the program)
    public static void main(String[] args) {
        // Create an object of the Car class
        _1carClassObject myCar = new _1carClassObject("Toyota Camry", 2022, "Blue");

        // Access the method of the Car class
        myCar.displayDetails();  // Display details of myCar

        // Create another object of the Car class
        _1carClassObject yourCar = new _1carClassObject("Honda Accord", 2020, "Red");

        // Access the method of the Car class
        yourCar.displayDetails();  // Display details of yourCar
    }
}
