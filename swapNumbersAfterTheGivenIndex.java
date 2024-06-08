import java.util.*;
import java.lang.*;

public class swapNumbersAfterTheGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the size of the ArrayList : ");
        int size = sc.nextInt();

        System.out.print("Enter the values to be passed into the array : ");
        for(int i = 0; i < size; i++) {
            int val = sc.nextInt();
            arr.add(val);
        }

        System.out.print("Enter the index value to swap :");
        int index = sc.nextInt();

        swapNumbers(arr, index);

        System.out.println("ArrayList After swapping : "  + arr);
    }
        public static void swapNumbers(ArrayList<Integer> arr, int m){


            if(m >= 0 && m < arr.size()-1) {
                int i = m + 1;
                int j = arr.size() -1;

                while (i <= j) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    i++;
                    j--;
                }
            }
//            System.out.println(arr);
        }
}



//import java.util.ArrayList;
//public class swapNumbersAfterTheGivenIndex {
//    public static void main(String[] args) {
//        // Sample ArrayList
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        // Index after which swapping should start
//        int startIndex = 2;
//        // Call the method to swap integers after the given index
//        swapIntegersAfterIndex(arrayList, startIndex);
//        // Print the updated ArrayList
//        System.out.println("Updated ArrayList: " + arrayList);
//    }
//    public static void swapIntegersAfterIndex(ArrayList<Integer> arr, int startIndex) {
//        // Check if the startIndex is valid
//        if (startIndex >= 0 && startIndex < arr.size() - 1) {
//            int i = startIndex + 1;
//            int j = arr.size() - 1;
//            while (i < j) {
//                // Swap elements at indices i and j
//                int temp = arr.get(i);
//                arr.set(i, arr.get(j));
//                arr.set(j, temp);
//                // Move to the next pair of elements
//                i++;
//                j--;
//            }
//        } else {
//            System.out.println("Invalid startIndex");
//        }
//    }
//}
