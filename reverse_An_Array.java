import java.util.Scanner;

public class reverse_An_Array {
    static void reverseArray(int a[], int n){
        for(int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        return;
    }

    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++){
            int arr = sc.nextInt();
        }
        reverseArray(ar, n);
    }
}
