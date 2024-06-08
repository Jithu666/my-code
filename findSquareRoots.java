import java.util.Scanner;

public class findSquareRoots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test-cases : ");
        int t = sc.nextInt();

        while(t-- > 0){
            System.out.print("Enter value to find the square root of a number");
            int a = sc.nextInt();

            int res = (int)Math.sqrt(a);

            System.out.print("Square root of " + a + " is : " + res);
            System.out.println();
        }

    }
}
