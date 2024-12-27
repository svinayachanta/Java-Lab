package _3stringsConditionalsAndLoops;

public class _4switchCase {
    public static void main(String[] args) {
        int day = 1;
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Provide Day b/w 1 and 3");
        }
    }
}
