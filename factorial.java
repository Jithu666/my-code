import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find the factorial :");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " is : " + result);
    }
    static int factorial(int num){

        if(num == 0)
            return 1;
        else {

            int smallerInp = factorial(num - 1);

            return num * smallerInp;
        }
    }
}
