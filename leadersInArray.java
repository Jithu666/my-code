import java.util.*;

public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{16,17, 4,3,5,2};
        int n = arr.length;
        leadersInArray l = new leadersInArray();
        ArrayList<Integer> s = leaders(arr, n);
//        printleaders(arr, n);
        System.out.println(s);
    }

    static ArrayList<Integer> leaders(int[] arr, int n){
//        static void printleaders(int arr[], int n){
        ArrayList<Integer> leader = new ArrayList<>();

        int maxFromRight = arr[n-1];
//        System.out.println(maxFromRight);
        leader.add(maxFromRight);
        System.out.println(maxFromRight);

        if(n == 0)
            return leader;

        for(int i = n - 2; i >= 0; i--){
            if(maxFromRight < arr[i]) {
                maxFromRight = arr[i];
                leader.add(maxFromRight);
                System.out.println(maxFromRight);
            }
        }
        return leader;
    }
}
