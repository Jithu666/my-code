import java.util.Scanner;

public class goodString_badString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Test-Cases : ");
        int t = sc.nextInt();

        while(t-- >= 0){
            String input = sc.next();

            String output = validateString(input);
            System.out.println(output);
        } // end of while loop
        sc.close();
    } // end of main method
private static String validateString(String input){
    StringBuilder result = new StringBuilder();

//    int len = result.length() - 1;
    for(int start_idx = 0; start_idx < input.length(); start_idx++){
        char curr_Char = input.charAt(start_idx);

        if(start_idx == 0 || curr_Char != result.charAt(result.length()-1))
            result.append(curr_Char);
        } // end of for loop

    return result.toString();
    } // end of validate-string method
} // end of class