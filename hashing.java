import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {


        int arr[] = {1,0,2,1,0,9,6,3,5,6,4,8,6,9};
        int num = 6;

        hash(arr, num);
    }
    static void hash(int[] arr, int num){
        int n = arr.length;

        int hash[] = new int[15];
        for(int i = 0; i < n; i++){
            hash[arr[i]] += 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to find occurrences : ");
        int check_Var = sc.nextInt();
        System.out.println(hash[check_Var]);
    }
}
