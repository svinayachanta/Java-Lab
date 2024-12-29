package _5methods;

public class _3variableArguments {
    public static void displayNumbers(int... numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        displayNumbers(1, 2, 3, 4, 5); // Pass any number of arguments
        displayNumbers(10, 20); // Outputs: 10 20
    }
}
