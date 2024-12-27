package _4array;

public class _2array1DForEachLoop {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.println("For-Each Loop, number = " + i++);
        }
    }
}
