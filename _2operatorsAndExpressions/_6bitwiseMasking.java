package _2operatorsAndExpressions;

public class bitwiseMerging {
    public static void main(String[] args) {
        int num = 0b11011010; // Binary: 11011010 (218 in decimal)
        int mask = 0b00001111; // Binary: 00001111 (Mask to isolate the last 4 bits)

        // Apply the mask
        int result = num & mask; // Binary: 00001010 (10 in decimal)
        System.out.println(result); // Output: 10
    }
}
