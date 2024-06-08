import java.util.Scanner;

public class tripletCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-- > 0){
            int N = sc.nextInt();

            int A[] = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            int triplets = tripletCount(N, A);
            System.out.println(triplets);
        } // end of while loop
    } // end of main()

    static boolean isPrime(int num){
        if(num <= 1)
            return false;

        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        } // end of for loop
        return true;
    } // end of isPrime()

    static int tripletCount(int N, int[] A){
        int count = 0;

        for(int i = 0; i < N-2; i++){
            for(int j = i + 1; j < N-1; j++){
                for(int k = j + 2; k < N; k++){
                    int sum = A[i] + A[j] + A[k];
                    if(isPrime(sum))
                        count++;
                } // end of for loop (k)
            } // end of for loop (j)
        } // end of for loop (i)
        return count;
    } // end of tripletCount()
} // end of class
