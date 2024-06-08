import java.util.Scanner;

public class largestOfThreeNumbres {
    public static void main(String[] args) {
        System.out.print("Enter Three Integers : ");
        Scanner in = new Scanner(System.in);

        int x, y, z;

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if(x > y && x > z)
            System.out.println(x + " is the greatest of the three numbers");
        else if(y > z && y > x)
            System.out.println(y + " is hte greatest of the three numbers ");
        else if(z > x && z > y)
            System.out.println(z + " is the largest of the three numbers");
        else
            System.out.println("enter three distinct numbers");
    }
}
