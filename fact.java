import java.util.Scanner;

public class fact {

        public static void main(String args[]) {

            // Write code here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printFactorial(n);
        }

        public static int printFactorial(int n){
            while(n>1) {
                printFactorial(n - 1);
            }
        return printFactorial(n*n-1);
    }
}
