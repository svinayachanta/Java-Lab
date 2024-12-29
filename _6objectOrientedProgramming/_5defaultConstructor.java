package _6objectOrientedProgramming;

public class _5defaultConstructor {
    int number;
    String text;

    public static void main(String[] args) {
        _5defaultConstructor obj = new _5defaultConstructor(); // Default constructor
        System.out.println("Number: " + obj.number); // Defaults to 0
        System.out.println("Text: " + obj.text);     // Defaults to null
    }
}
