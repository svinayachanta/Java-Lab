package _6objectOrientedProgramming;

public class _4nonParameterizedConstructor {
    int number;
    String text;

    // Non-Parameterized Constructor
    public _4nonParameterizedConstructor() {
        number = 0;
        text = "Default Text";
    }

    public static void main(String[] args) {
        _4nonParameterizedConstructor obj = new _4nonParameterizedConstructor();
        System.out.println("Number: " + obj.number);
        System.out.println("Text: " + obj.text);
    }
}
