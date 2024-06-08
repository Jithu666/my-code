import java.util.Scanner;

public class trinagle {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = in.nextInt();

        System.out.print("enter the number of columns");

        int m = in.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
