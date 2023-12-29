import java.util.*;
public class birthdayParty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int cost[] = new int[N];

            for(int i = 0; i < N; i++){
                cost[i] = sc.nextInt();
            }
            if(canInvite(N,X,cost))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
    static boolean canInvite(int N, int X, int[] cost){

        int cur_sum = 0;
        int start = 0;

        for(int i = 0; i < N; i++){
            cur_sum += cost[i];

            while(cur_sum > X && start <= i){
                cur_sum -= cost[start];
                start++;
            }
            if (cur_sum == X)
                return true;
        }
        return false;
    }
}
