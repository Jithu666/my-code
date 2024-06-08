import java.util.*;
import java.lang.*;


public class target {
        public static void swap(int a, int b){
            {
                a = a + b;
                b = a - b;
                a = a - b;
            }
            System.out.println("Value after swapping");
            System.out.println("Value of a is " + a);
            System.out.println("Value of b is " + b);

        }

    public static void main(String[] args) {
        swap(2, 9);
    }
}
