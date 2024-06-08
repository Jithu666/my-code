import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of your choice :");
        int x = sc.nextInt();
        countDigit(x);
    }

    public static void countDigit(int x){
        int lastno;
        int count = 0;

        while(x > 0){
            lastno = x % 10;
            x = x / 10;
            count++;
        }
        System.out.println("The number of Digits are : " + count);

//        Collection<Integer> col = new ArrayList<>();
//        col.add(lastno);
    }
}
