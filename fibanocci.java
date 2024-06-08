import java.util.Scanner;

public class fibanocci {

    static int fibo(int n){
    if(n == 0 || n == 1)return 1;

        int prev = fibo(n-1);
        int prev_1= fibo(n-2);

        return prev + prev_1;
        //    return ans + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
