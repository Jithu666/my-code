import java.util.Scanner;

public class oneTon_backtracking {
    public static void backtrack(int i, int n){
        if(i < 1){
            return;
        }
        backtrack(i-1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        backtrack(n, n);
    }
}
