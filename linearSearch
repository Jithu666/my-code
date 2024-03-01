import java.util.Scanner;

public class helloWorld {
    public static int linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;  // Item found at index i
            }
        }
        return -1;  // Item not found in the array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[size];
        System.out.print("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the item to search for
        System.out.print("Enter the item to search for: ");
        int item = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(arr, item);

        // Output the result
        if (index != -1) {
            System.out.println("Item found at index " + index);
        } else {
            System.out.println("Item not found in the array.");
        }

        scanner.close();
    }
}
