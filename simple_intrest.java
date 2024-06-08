import java.util.Scanner;

public class simple_intrest {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("enter principal amount");
        float p = Sc.nextFloat();

        System.out.println("enter time period");
        int t = Sc.nextInt();

        System.out.println("enter rate of intrest");
        float r = Sc.nextFloat();

        float si = (p*t*r)/100;

        System.out.println("principal: " + p);
        System.out.println("time:" + t);
        System.out.println("rate of intrest:" + r);

        System.out.println("the simple intrest is : " + si);
    }
}
