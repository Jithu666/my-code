import java.util.Map;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("The GCD of : " + a + " and " + b + " is " + findGCD(a,b));
    }
    static int findGCD(int a, int b){
        int GCD = 1;
//        int i;
//        int min = Math.min(a,b);
//        for(int i = min; i >= 1; i--){
//            if(a%i == 0 && b%i == 0){
//                GCD = i;
//                break;
//            }// end of if condition
//        }// end of for loop
        while(a > 0 && b > 0){
            if(a > b)
                a = a%b;
            else
                b = b%a;
        }
        if(a == 0)
            return b;
        else
            return a;
    }
}
