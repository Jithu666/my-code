import java.io.*;
import java.util.*;

public class add2No_s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of test cases : ");
        int t = sc.nextInt();
//        int a, b;
        int sum = 0;
        while(t > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = a + b;
            t--;
            System.out.println("The sum of the Numbers " + a + "and " + b + " is : " + sum);
        }
        System.out.println("You have completed the maximum test cases limit which you have entered earlier");
    }
}
