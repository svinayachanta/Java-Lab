package operatorsExpressions;

import java.util.Scanner;

public class area 
{
    public static void main(String[] args) 
    {
        float base, height, area;
        System.out.println("Enter base and height: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (base * height) / 2;
        System.out.println("Area is " + area);
    }
}
