import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of hte array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        int idx = 0;
        int firstNonNegativeElementIndex = n;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                firstNonNegativeElementIndex = i;
                break;
            }
        }
        int negItr = firstNonNegativeElementIndex - 1;
        int posItr = firstNonNegativeElementIndex;
        while (negItr >= 0 && posItr < n) {
            int negElementSquare = arr[negItr] * arr[negItr];
            int posElementSquare = arr[posItr] * arr[posItr];
            if (negElementSquare < posElementSquare) {
                ans[idx++] = negElementSquare;
                negItr--;
            } else {
                ans[idx++] = posElementSquare;
                posItr++;
            }
        }
        while (negItr >= 0) {
            ans[idx++] = arr[negItr] * arr[negItr];
            negItr--;
        }
        while (posItr < n) {
            ans[idx++] = arr[posItr] * arr[posItr];
            posItr++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}