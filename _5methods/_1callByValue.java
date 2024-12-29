package _5methods;

public class _1callByValue {
    public static void modifyValue(int x) {
        x = x * 2; // This change won't affect the original variable
    }

    public static void main(String[] args) {
        int number = 10;
        modifyValue(number);
        System.out.println("Value after method call: " + number); // Outputs 10
    }
}
