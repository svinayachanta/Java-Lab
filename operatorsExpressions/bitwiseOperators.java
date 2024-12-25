package operatorsExpressions;

public class bitwiseOperators {
    public static void main(String[] args) {
        int x = 0b1010; // 10
        int y = 0b0110; // 6
        int z;
        z = x & y; // AND
        System.out.println(z);
        z = x | y; // OR
        System.out.println(z);
        z = x ^ y; // XOR
        System.out.println(z);
        z = ~x; // NOT
        System.out.println(z);
        z = x << 1; // LEFT SIIFT
        System.out.println(z);
        z = x >> 1; // RIGHT SHIFT
        System.out.println(z);
        z = x >>> 2; // UNSIGNED RIGHT SHIFT
        System.out.println(z);
    }
}
