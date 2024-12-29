package _6objectOrientedProgramming;

class CarCompany {
    void sound() {
        System.out.println("Cars make sounds");
    }
}

// Subclass
class Ford extends CarCompany {
    @Override
    void sound() {
        System.out.println("Mustang vrooms");
    }
}

// Another Subclass
class BMW extends CarCompany {
    @Override
    void sound() {
        System.out.println("M5 Brrrrs");
    }
}


public class _10polymorphismOverriding {
    public static void main(String[] args) {
        // Upcasting (Demonstrating Polymorphism)
        CarCompany myAnimal = new CarCompany(); // Parent class object
        myAnimal.sound();

        CarCompany ford = new Ford(); // Dog object as Animal type
        ford.sound();

        CarCompany bmw = new BMW(); // Cat object as Animal type
        bmw.sound();
    }    
}
