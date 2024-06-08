import java.util.Scanner;

public class printZ {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size - 1 || i + j == 6) {
                    System.out.print("*"+" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
