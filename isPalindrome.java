// using built-in function from stringbuilder class

//public class isPalindrome {
//    public static void main(String[] args) {
//        String str = "madame";
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        if(str.equals(sb.toString())){
//                System.out.println(str + " is Palindrome");
//        }else{
//            System.out.println(str + " Is not palindrome");
//        }
//    }
//}


// without using stringbuilder class's built-in function


public class isPalindrome {
    public static void main(String[] args) {
        String str = "radar";

        isPalindrome(str);
    }
    static void isPalindrome(String str){
        boolean flag = false;
        String temp = "";

        for(int i = str.length()-1; i >= 0; i--){
            temp = temp + str.charAt(i);
            if(str.equals(temp))
                flag = true;
        }
//        System.out.println(flag);
        if(flag == true){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
