package _6objectOrientedProgramming;

public class _2personGetterSetter {
    // Private fields (Encapsulation)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Basic validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Main method to demonstrate getters and setters
    public static void main(String[] args) {
        // Create an object of the Person class
        _2personGetterSetter person = new _2personGetterSetter();

        // Set values using setters
        person.setName("John Doe");
        person.setAge(25);

        // Get values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempt to set invalid age
        person.setAge(-5); // This will trigger validation
    }
}
