import java.util.Scanner;

public class main678 {

    static int countNumbers(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(countNumbers(n));
    }
}
