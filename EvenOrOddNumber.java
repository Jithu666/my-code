import java.util.*;

public class EvenOrOddNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int result = evenOdd(num);

        if(result == 1){
            System.out.println("The Number " + num + " is Even");
        }else
            System.out.println("The Number " + num + " is Odd");

    }

    public static int evenOdd(int num){

        if(num % 2 == 0)
            return 1;
        else
            return -1;
    }
}
