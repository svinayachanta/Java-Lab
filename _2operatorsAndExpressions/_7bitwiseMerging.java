package _2operatorsAndExpressions;

public class _7bitwiseMerging {
    public static void main(String[] args) {
        int a = 0b1010;  // Binary: 1010 (10 in decimal)
        int b = 0b1100;  // Binary: 1100 (12 in decimal)

        // Merging the two patterns
        int merged = a | b; // Binary: 1110 (14 in decimal)
        System.out.println(merged); // Output: 14
    }
}
