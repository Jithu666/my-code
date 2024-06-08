import java.util.Scanner;

class recur{
    public static void printName(int i, int n){

        if(i > n){
            return;
        }
        System.out.println("this is jithu");
        printName(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        printName(1, n);
    }
}
