import java.util.Scanner;
public class test_0{
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you need to find the factorial of : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}