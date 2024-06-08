import java.util.Scanner;

public class multiples {
    static int multiple(int n, int k){
        if(k <= 0){
            return 0;
        }
       multiple(n,k-1);

            if(k % n == 0){
                System.out.println(k + " ");
             }
        return k;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(multiple(n,k));

    }
}
