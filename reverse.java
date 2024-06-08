import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse:");
        int num = sc.nextInt();
        int reversedNumber = reverse(num);
        System.out.println("Reversed Number : " + reversedNumber);
    }

    private static int reverse(int num){
        int reversed_num = 0;

        while(num != 0){
            int digit = num%10;
//            reversed_num = reversed_num * 10 + digit;
//            num = num / 10;
            if (reversed_num > Integer.MAX_VALUE / 10 || (reversed_num == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }
            if(reversed_num < Integer.MIN_VALUE / 10 || (reversed_num == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            reversed_num = reversed_num * 10 + digit;
            num = num / 10;
        }
        return reversed_num;
    }
}
