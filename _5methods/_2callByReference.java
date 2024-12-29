package _5methods;

public class _2callByReference {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = {10, 20, 30, 40, 50};
        
        // Print array before modification
        System.out.println("Before modification:");
        printArray(arr);
        
        // Modify the element at index 1 directly
        changeArrayElement(arr);
        
        // Print array after modification
        System.out.println("After modification:");
        printArray(arr);
    }

    // Method to change the element at index 1
    public static void changeArrayElement(int[] array) {
        // Directly change the element at index 1
        array[1] = 100;  // This modifies the value at index 1 to 100
    }

    // Utility method to print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
