import java.util.*;

public class minLengthOfPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int N = sc.nextInt();
            int A[] = new int[N];
            int B[] = new int[N];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            } // end of for loop

            for (int i = 0; i < N; i++){
                B[i] = sc.nextInt();
            } // end of for loop

            int result = minSubarray(N, A, B);
            System.out.println(result);
        } // end of while loop
    } // end of main method

    static int minSubarray(int N, int[] A, int[] B){

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        while(i < N && A[i] == B[i]){
            i++;
        } // end of while loop

        int j = N - 1;
        while(j >= 0 && A[j] == B[j]){
            j--;
        } // end of while loop

        int min = (i <= j) ? (j - i + 1) : 0;

        return min;
    }
} // end of class
