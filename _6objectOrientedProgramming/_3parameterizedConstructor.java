package _6objectOrientedProgramming;

public class _3parameterizedConstructor {
    int number;
    String text;

    // Parameterized Constructor
    public _3parameterizedConstructor(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public static void main(String[] args) {
        _3parameterizedConstructor obj = new _3parameterizedConstructor(10, "Hello Java");
        System.out.println("Number: " + obj.number);
        System.out.println("Text: " + obj.text);
    }
}
