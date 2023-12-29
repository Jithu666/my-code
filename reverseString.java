import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Test-Cases : ");
        int t = sc.nextInt();

        while(t-- >= 0) {
            System.out.print("Enter String : ");
            String input1 = sc.nextLine();
//            String input2 = sc.next();

            String rev_str = reverse_String(input1);
            System.out.println("Original String is " + input1 +" Reversed String is : " + rev_str);
        }
    }
    static String reverse_String(String input){

        char[] charArray = input.toCharArray();
        int start_idx = 0;
        int end_idx = charArray.length - 1;


        while (start_idx < end_idx){
            char temp = charArray[start_idx];
            charArray[start_idx] = charArray[end_idx];
            charArray[end_idx] = temp;
            start_idx++;
            end_idx--;
        }

        return new String(charArray);
    }
}
