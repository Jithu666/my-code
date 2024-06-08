import java.util.Scanner;

public class swap_a {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int m = 100100;
        int[] freq = new int[m];
        for(int i = 0; i < n; i++){
            freq[a[i]] = freq[a[i]] + 1;
        }
        int q;
        q = sc.nextInt();
        while(q-- > 0){
            int val;
            val = sc.nextInt();
            if(freq[val] > 0){
                System.out.println("YES");
                System.out.println("NO");

            }
        }
    }
}