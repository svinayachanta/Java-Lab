package _6objectOrientedProgramming;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Another child class
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
    
    // Main class
public class _8inheritance {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Defined in Dog

        // Create a Cat object
        Cat myCat = new Cat();
        myCat.eat();// Inherited from Animal
        myCat.meow(); // Defined in Cat
    }
}
