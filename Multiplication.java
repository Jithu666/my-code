import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int y = in.nextInt();

        System.out.println("MULTIPLICATION TABLE");
        for(int i = 1; i <= y; i++){
            for(int j = 1; j <= y; j++){
                System.out.print("" + i * j + " ");
            }
            System.out.println("\n");
        }
    }
}
