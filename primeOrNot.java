import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0 && n%3==0)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
}
