import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println("Fibonacci sequence");
        int f1, f2 = 0, f3 = 1;
        for(int i = 1; i <= f; f++){
            System.out.println(" " + f3 + " ");
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}
