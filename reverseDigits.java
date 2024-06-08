//import java.util.Scanner;
//
//public class reverseDigits {
//    public static void main(String[] args) {
//        int rev = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number :");
//        int x = sc.nextInt();
//
//        while(x > 0){
//            int lastno = x % 10;
//            x = x/10;
//            rev = (rev * 10) + lastno;
//        }
//        System.out.println("The Number " + x + "after reversing it is :" + rev);
//    }
//}

public class reverseDigits {
    public static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 32; i++)
        {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        long x = 123456;
        reverseBits(x);
    }
}