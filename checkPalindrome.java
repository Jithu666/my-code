import java.util.Scanner;

public class checkPalindrome {
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,1,2,1};
//
////        System.out.print("Original Array : ");
////        printArray(arr);
////        System.out.println();
//
//
//        System.out.print("Array is palindrome : " + isPalindrome(arr, 0, arr.length-1));
//
//    }
//
//    static boolean isPalindrome(int arr[], int idx, int end_idx){
//
//        if(idx >= end_idx)
//            return true;
//
//        if(arr[idx] != arr[end_idx])
//            return false;
//
//        return isPalindrome(arr,idx + 1, end_idx - 1);
//    }
//
//    static void printArray(int arr[]){
//        for(int i : arr)
//            System.out.print(i + " ");
//    }

//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter Number : ");
//        int num = s.nextInt();
//
//        int original_Num = num;
//
//        int a = isPalindrome(num);
//        if(original_Num == a)
//            System.out.print("The number " + original_Num + " is palindrome");
//        else
//            System.out.println("The number is not palindrome!");
//    }
//    static int isPalindrome(int num){
//        int reversed_no = 0;
//        while(num != 0){
//            int digit = num % 10;
//            reversed_no = reversed_no * 10 + digit;
//            num /= 10;
//        }
//        return reversed_no;
//    }
//    import java.util.Scanner;

//    public class PalindromeWithZeroes {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (isPalindromeWithZeroes(input)) {
                System.out.println(input + " is a palindrome");
            } else {
                System.out.println(input + " is not a palindrome");
            }

            scanner.close();
        }

        private static boolean isPalindromeWithZeroes(String input) {
            // Remove leading and trailing zeroes
            String strippedInput = input.replaceAll("^0+|0+$", "");

            // Check if the stripped input is a palindrome
            return isPalindrome(strippedInput);
        }

        private static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

}
