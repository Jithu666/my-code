public class removeDuplicatesFromString {
    public static void main(String[] args) {

        String str = "RRR";

//        System.out.println(str.substring(1));

        System.out.println("Oiginal String : " + str);

        String variable = removeDuplicates(str);

        System.out.println("String after removing duplicate occurences : " + variable);
    }

    public static String removeDuplicates(String str) {

        if (str.length() <= 1)
            return str;

        if (str.charAt(0) == str.charAt(1)) {
            return removeDuplicates(str.substring(1));
        } else{
            return str.charAt(0) + removeDuplicates(str.substring(1));
        }
    }
}
