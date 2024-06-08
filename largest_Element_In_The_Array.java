import java.util.Scanner;

public class largest_Element_In_The_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the array :");
//        int n = sc.nextInt();
//
//        int arr;
//        System.out.print("Enter the values into the array :");
//        for(int i = 0; i <  n; i++) {
//            arr = sc.nextInt();
//        }
//
//        largestElement(arr[], n);
//
//    }
//
//    public static void largestElement(int arr[], int n){

        int arr[] = {5,4,3,2,1,9,8,7,6};

        int max = arr[0];

        for(int i = 0; i <  arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is : " + max);
    }

}
