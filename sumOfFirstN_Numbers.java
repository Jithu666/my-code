public class sumOfFirstN_Numbers {

    public static void main(String[] args) {
        int n = 5;
        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " numbers is: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 1) {
            return 1; // Base case: sum of the first number is 1
        } else {
            return n + calculateSum(n - 1); // Recursive step: add current number to the sum of the rest
        }
    }
}
