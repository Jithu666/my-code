import java.util.Scanner;

public class printNRecursively {
    public static void printN(int i, int n){
        if (i == 1){
            return;
        }
        System.out.print(n + " ");
        printN(n-1, n);
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(i, n);
        System.out.print("1");
    }
    
}
