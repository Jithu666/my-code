import java.util.*;
public class printName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        printName(5, name);
    }

    static void printName(int n, String name){



        if(n > 0) {
            System.out.println("You are  " + name);
            printName(n - 1, name);
        }
    }
}
