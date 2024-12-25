package operatorsExpressions;

public class bitwiseSwap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = a ^ b; // a XOR b
        b = a ^ b; // a XOR b
        a = a ^ b; // a XOR b
        System.out.println(a + " " + b);
    }    
}
