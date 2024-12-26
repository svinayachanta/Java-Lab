package _2operatorsAndExpressions;

public class _2incrementDecrement 
{
    public static void main(String[] args) {
        int x = 5;
        x++;
        System.out.println(x);

        int a = 5, b;
        b = a++; // first increment is done and then assignment
        System.out.println(a + " " + b);

        int c = 5, d;
        d = ++c; // first assignment is done and then increment
        System.out.println(c + " " + d);
    }
}
