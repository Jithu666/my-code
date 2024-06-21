import java.util.Arrays;

public class largestElement_in_Array {

//  Brute force method
//    it takes auxillary space O(n)
//    as we use built in sort methods which in turn uses merge sort or quick sort, the time complexity is O(n*logn)

//    public static void main(String[] args) {
//
//        int arr[] = {-1, -2};
//        int largest = findLargest(arr);
//        System.out.println("Largest element in the array is " + largest);
//    }
//
//    static int findLargest(int []arr){
//        int size = arr.length;
//
//        Arrays.sort(arr);
//        return arr[size-1];
//    }

//  Better approach

//    i'll be using a variable max, assigned with arr[0]
//    run a for loop and compare with each elemet of the array and return the max,

    public static void main(String[] args) {

        int arr[] = {0, 0, 0, 0, };
        int res = findLargest(arr);
        System.out.println("Largest in the array is " + res);

    }
    static int findLargest(int [] arr){
        int size = arr.length;
        int max = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
    return max; // it takes a auxillary space of O(n) as the for loop traverses for all the elements in the array,
//        time complexity of O(n)
    }
}
