import java.util.Scanner;

public class floor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
//            if(n.contains("  ") {
//            System.out.println("The String has two white spaces");
//        }
//            else if(n.contains("   "){
//                System.out.println("the string contains triple white spaces");
//            }
        String x = "thanks a lot";
        String y = "abdul";
//        string before replacement

//        System.out.println(n + " " + x);

//        string after replacement

        String a = a(n, y, x);

        System.out.println(y + " " + x);
//        System.out.println("");

    }//end of main


    public static String a(String n, String y, String x) {
        return x.replaceAll(n, y);
    }
}//end of class
