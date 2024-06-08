import java.util.*;

public class isArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");

        int num = sc.nextInt();
        int temp = num;
        int n = num;
        int count = 0;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        int SumOfPower = 0;
        while(n != 0){
            int last_digit = n % 10;
            SumOfPower += Math.pow(last_digit, count);
            n /= 10;
        }
        if(SumOfPower == num)
            System.out.println("The number is Armstrong!");
        else
            System.out.println("The Number is not Armstrong number !");
    }
}
