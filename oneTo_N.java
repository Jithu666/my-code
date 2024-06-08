import java.util.Scanner;

public class oneTo_N {
    public static void printN(int i, int n){
        if (i > n){
            return;
        }
        System.out.print(i + " ");
        printN(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        printN(1, n);
    }
}
