package _3stringsConditionalsAndLoops;

public class _2conditionalStatements {
    public static void main(String[] args) {
        int a = 5, b = 15, c = 5;
        if(a>b && a>c) {
            System.out.println(a);
        }
        else if(b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}
