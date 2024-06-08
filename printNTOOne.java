import java.util.Scanner;

public class printNTOOne {
    public static void printN_to_One(int i, int n){
        if (i < 1)
            return;
        System.out.print(i + " ");
        printN_to_One(i -1 ,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        printN_to_One(n, n);
    }
}
