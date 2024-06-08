import java.util.*;

public class printNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value to print : ");
        int n = sc.nextInt();
        printNumbers(n, 1);
    }

    static void printNumbers(int n, int base_cond){

        if(n >= base_cond){
            System.out.print(n + " ");
            printNumbers(n-1, base_cond);
        }
    }
}
