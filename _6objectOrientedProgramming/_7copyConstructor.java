package _6objectOrientedProgramming;

public class _7copyConstructor {
    int number;
    String text;

    // Parameterized Constructor
    public _7copyConstructor(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Copy Constructor
    public _7copyConstructor(_7copyConstructor other) {
        this.number = other.number;
        this.text = other.text;
    }

    public static void main(String[] args) {
        _7copyConstructor original = new _7copyConstructor(100, "Original Object");
        _7copyConstructor copy = new _7copyConstructor(original);
        
        System.out.println("Original -> Number: " + original.number + ", Text: " + original.text);
        System.out.println("Copy -> Number: " + copy.number + ", Text: " + copy.text);
    }
}
