import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class minLengthOfPermutations {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            // Input the size of the arrays
            int N = scanner.nextInt();

            // Input the elements of the first array
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }

            // Input the elements of the second array
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }

            // Find the minimum subarray length
            int minSubarrayLength = findMinSubarrayLength(N, A, B);
            System.out.println(minSubarrayLength);
        }

        scanner.close();
    }

    // Function to find the minimum subarray length to make arrays A and B permutations of each other
    private static int findMinSubarrayLength(int N, int[] A, int[] B) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of elements in array A
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Initialize variables
        int start = 0, end = 0, diffCount = 0, minSubarrayLength = Integer.MAX_VALUE;

        // Iterate through array B
        while (end < N) {
            int currentNum = B[end];

            // Update countMap and diffCount based on the current element in array B
            if (countMap.containsKey(currentNum)) {
                countMap.put(currentNum, countMap.get(currentNum) - 1);
                if (countMap.get(currentNum) == 0) {
                    diffCount++;
                }
            }

            // Move the start pointer until the subarray no longer satisfies the condition
            while (diffCount > 0) {
                int startNum = B[start];
                if (countMap.containsKey(startNum)) {
                    if (countMap.get(startNum) == 0) {
                        diffCount--;
                    }
                    countMap.put(startNum, countMap.get(startNum) + 1);
                }
                start++;
            }

            // Update the minimum subarray length
            if (end - start + 1 == N) {
                return 0; // Full array is a permutation, no need to sort
            } else if (end - start + 1 < minSubarrayLength) {
                minSubarrayLength = end - start + 1;
            }

            end++;
        }

        return minSubarrayLength;
    }
}
