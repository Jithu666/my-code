public class fibonacciSequence {
    public static void main(String[] args) {

        int n = 9;

        System.out.println("Fibonacci Sequence of " + n + " is : ");
        for(int i = 0; i < n; i++){
            System.out.print(fibonacciSequence(i) + " ");
        }
    }
    public static int fibonacciSequence(int n){

        if(n <= 1)
            return n;
        else
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
    }
}
