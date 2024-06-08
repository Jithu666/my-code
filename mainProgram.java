import java.util.Scanner;

public class mainProgram{
     static int numOfDigits(int n){
         int sum = 0, count = 0;
         while(n > 0){
             n /= 10;
             count++;
         }
         return count;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numOfDigits(n));
    }

}