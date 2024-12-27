package _4array;

public class _1array1DForLoop {
    public static void main(String[] args) {
        int A[] = new int[5];
        
        int B[] = {1,2,3,4,5};
        B[2] = 15;

        for(int i=0; i<A.length; i++) {
            System.out.println("Array A Initialized: " + A[i]);
        }

        for(int i=0; i<B.length; i++) {
            System.out.println("Array B Values: " + B[i]);
        }

    }
}
