import java.util.*;
public class expiring_Bread {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i = 0; i < t; i++){
                int N = sc.nextInt();
                int M = sc.nextInt();
                int K = sc.nextInt();
                System.out.println(M*K<N?"No":"Yes");
        }
    }
}
