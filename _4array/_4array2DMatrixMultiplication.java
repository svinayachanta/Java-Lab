package _4array;

public class _4array2DMatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int B[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int C[][] = new int[3][3];
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<A[0].length; j++) {
                C[i][j] = A[i][j] * B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
