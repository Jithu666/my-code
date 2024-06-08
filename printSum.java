public class printSum {
    static int printSum(int n){
        if (n < 1)
            return 1;
        return n * printSum(n-1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("The product of numbers from " +  1 + " to " + n + " is : " + printSum(n));
    }
}
