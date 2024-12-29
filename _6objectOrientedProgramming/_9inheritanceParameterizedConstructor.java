package _6objectOrientedProgramming;

class Rectangle {
    private int length;
    private int breadth;

    // Parameterized Constructor
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of the rectangle
    public int getArea() {
        return length * breadth;
    }

    // Getters for length and breadth
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

// Child Class: Cuboid
class Cuboid extends Rectangle {
    private int height;

    // Parameterized Constructor
    public Cuboid(int length, int breadth, int height) {
        super(length, breadth); // Call the constructor of Rectangle
        this.height = height;
    }

    // Method to calculate volume of the cuboid
    public int getVolume() {
        return getLength() * getBreadth() * height;
    }
}

public class _9inheritanceParameterizedConstructor {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        // Create a Cuboid object
        Cuboid cuboid = new Cuboid(5, 3, 4);
        System.out.println("Cuboid Volume: " + cuboid.getVolume());
    }    
}
