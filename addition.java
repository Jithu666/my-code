import java.util.Scanner;

public class addition{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of your choice:");
        int num = sc.nextInt();
        int remainder = 0;

        remainder = num % 10;
        remainder = num/10;
        num = num%10;

        System.out.println("the reversed number for the number you entered is : " + num);

    }
}
