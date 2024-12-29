package _6objectOrientedProgramming;

public class _6overloadedConstructor {
    int number;
    String text;

    // Non-Parameterized Constructor
    public _6overloadedConstructor() {
        number = 0;
        text = "Default";
    }

    // Parameterized Constructor
    public _6overloadedConstructor(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public static void main(String[] args) {
        _6overloadedConstructor obj1 = new _6overloadedConstructor();
        _6overloadedConstructor obj2 = new _6overloadedConstructor(42, "Overloaded");
        
        System.out.println("Object 1 -> Number: " + obj1.number + ", Text: " + obj1.text);
        System.out.println("Object 2 -> Number: " + obj2.number + ", Text: " + obj2.text);
    }
}
