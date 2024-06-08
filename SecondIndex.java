import java.util.*;

public class SecondIndex {
    public static void main(String[] args) {

        int arr[] = new int[6];
        arr[0] = 8;
        arr[1] = 7;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 4;
        arr[5] = 3;

        Arrays.sort(arr);

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);

        int res[] = new int[2];
        int S_max = arr.length;
        res[0] = arr[arr.length-2];
        res[1] = arr[1];

        System.out.println("Second Maximum and Second Minimum value in the array is : " + res[0]  + " and Second Minimum value in the array is " + res[1]);
    }
}
