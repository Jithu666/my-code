import java.util.Scanner;

public class sumOfDigits {
    static int sumOfDigits(int n){

        if(n == 0) return 0;
//        int ans = sumOfDigits(n/10);
         return (n % 10) + sumOfDigits(n/10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }

}
