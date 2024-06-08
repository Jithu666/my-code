import java.util.Scanner;

class sumOfDigit{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String result = "";
        for(int i = 2; i <=a; i++){
        result = result + i + " ";
    }
        System.out.println(result);
    }
}