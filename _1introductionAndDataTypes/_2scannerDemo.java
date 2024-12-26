package _1introductionAndDataTypes;

import java.lang.*;
import java.util.*;

class _2scannerDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum is " + c);
    }
}