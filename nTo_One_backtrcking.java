import java.util.Scanner;

public class nTo_One_backtrcking {
    public static void printRecursively(int i, int n){
        if(i > n)
            return;
        printRecursively(i + 1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        printRecursively(1, n);
    }
}
