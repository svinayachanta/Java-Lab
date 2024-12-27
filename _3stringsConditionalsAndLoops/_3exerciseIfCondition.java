package _3stringsConditionalsAndLoops;

import java.util.*;

public class _3exerciseIfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Scores of 2 Subjects");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        float avg = (float) (s1+s2)/2;
        System.out.println(avg);
        if(avg > 70){
            System.out.println("Grade A");
        }
        else if(avg >= 50 && avg < 70){
            System.out.println("Grade B");
        }
        else {
            System.out.println("Fail");
        }
    }
}
