import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        String s = new String();
//        s = "Jithendra";

//        System.out.println(s);

//        String s = "Jithendra";
//        System.out.println("Input String is: " + s);

//        STRING METHODS

//        String s = "Jithendra";
//        String s1 = "Gowda";;

        /* System.out.println(s.length());
        System.out.println(s.charAt(6));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(6));
        System.out.println(s.substring(0,8));
        System.out.println(s.concat(s1));
        System.out.println(s.compareTo(s1));
        System.out.println(s.contains("Githendra"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.equals(s1));
        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf(s));
        System.out.println(s1.replace("G", "J"));
        System.out.println(s.split("",4));
        System.out.println(s.startsWith("b"));
        System.out.println(s1.startsWith("c")); */

//      string constructors in java
//        using byte arr
//        byte[] b_arr = {74, 73, 84, 72, 85};
//        String s = new String(b_arr);


//        using Charset and byte array (Charset uses Charset.defaultCharset())
//        byte[] b_arr = {74, 73, 84, 72, 85};
//        Charset cs = Charset.defaultCharset();
//        String s = new String(b_arr, cs);


//        using char_set_names
//        byte[] b_arr = {74, 73, 84, 72, 85};
//        String s = new String(b_arr, StandardCharsets.US_ASCII);


//        using byte arr[], start index and size of the byte_array(the start index and the size should be equal to or less than the size of the byte_array)
//        byte b_arr[] = {106, 105, 116, 104, 117, 45, 103, 111, 119, 100, 97};
//        String s = new String(b_arr, 2, 10);

//        using byte_arr[], start_idx, size and Charset
//        byte b_arr[] = {106, 105, 116, 104, 117, 45, 103, 111, 119, 100, 97};
//        Charset cs = Charset.defaultCharset();
//        String s = new String(b_arr, 1, 10, cs);


//        using byte_arr[], start_idx, size, char_set_names
//        byte b_arr[] = {106, 105, 116, 104, 117, 45, 103, 111, 119, 100, 97};
//        String s = new String(b_arr, 5, 1, StandardCharsets.US_ASCII);

//        using char_arr[]
//        char ch_arr[] = {'j', 'i', 't', 'h', 'u'};
//        String s = new String(ch_arr);

//        using char_arr[], start_idx and count of the characters
//        char ch_arr[] = {'j', 'i', 't', 'h', 'u'};
//        String s = new String(ch_arr, 0, 5);


//        using an int uni code[], start_idx and count
//            int uni_code[] = {106, 105, 116, 104, 117, 45, 45};
//            String s  = new String(uni_code, 0, 7);


//        String s1 = new String("JITHENDRA GOWDA");
//        StringBuilder s = new StringBuilder(s1);

//        using StringBuffer class of String
//        StringBuffer sb = new StringBuffer("JITHU");
//        String s = new String(sb);

//        using StringBuilder class of String
//        StringBuilder sb = new StringBuilder("J_KID");
//        String s = new String(sb);

//        System.out.println(s);




//        String methods in java

        String s = "Data_Structures_&_Algorithms";
//        System.out.println(s.length());
//        System.out.println(s.charAt(27));
//        System.out.println(s.substring(6));
//        System.out.println(s.substring(6,15));

        String s1 = " in Java";
//        System.out.println(s.concat(s1));
//        System.out.println(s+s1);

//        System.out.println(s.indexOf('r', 8));
//        System.out.println(s1.indexOf("J"));
//        System.out.println(s1.indexOf("l"));
//        System.out.println(s.lastIndexOf('_'));
//        System.out.println(s.indexOf('_'));
//        System.out.println(s.equals(s1));


//        String s2 = " IN JAVA ";

//        System.out.println(s1.equalsIgnoreCase(s2));

//        int out = s.compareTo(s2);
//        int out = s1.compareToIgnoreCase(s2);
//        System.out.println(out);

//        System.out.println(s.toLowerCase());

//        System.out.println(s1.toUpperCase());

//        System.out.println(s2.trim());

//        System.out.println(s.replace('_', '-'));

//        System.out.println(s.contains("Datqa"));

//        String s3 = "JITHU";
//        char []ch = s3.toCharArray();
//        System.out.println(ch);

//        System.out.println(s1.startsWith(s2));



//        String Tokenizer (String tokenizer class)

/*        StringTokenizer s = new StringTokenizer("Data_Structures_&_Algorithms");

        while(s.hasMoreTokens()){
            String token = s.nextToken();
            System.out.println(token);
        }
*/


//        s.concat(s1); Strings are immutable
//        s = s.concat(s1);


//        String s2 = new String("Jithu");
//        String intern = s2.intern();
//
//        System.out.println(intern);


//        System.out.println(s);

//        s.codePointAt(2);
//        System.out.println(s.codePointAt(3));
//        System.out.println(s.codePointBefore(1));
//        System.out.println(s.codePointCount(0,3));

//        System.out.println(s.contains("Data"));
//        System.out.println(s.contains("_"));
//        System.out.println(s.contains("-"));


//        System.out.println(s.startsWith("D"));
//        System.out.println(s1.startsWith(" "));

//        System.out.println(s.endsWith("W"));
//        System.out.println(s1.endsWith("a"));
//        System.out.println(s1.endsWith("W"));


//        char ch[] = new char[30];
//        s.getChars(0,28, ch,0);
//        System.out.println(ch);



//        String Buffer class in java

//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.reverse());
//        sb.append("J");
//        sb.append("i");
//        sb.append("t");
//        sb.append("h");
//        sb.append("u");
//        System.out.println(sb);
//        System.out.println(sb.toString());

//        Constructors in StringBuffer Class

//        StringBuffer creates the String with the size of 16,
//        System.out.println(sb.capacity());
//        System.out.println(sb.insert(5, " Gowda"));

//        sb.replace(5, 10, " GOWDA");

//            sb.delete(0, 5);
//            System.out.println(sb);

//        sb.append("Data Structures and Algorithms in Java");
//        System.out.println(sb.capacity());


//    String Builder class in Java

//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.capacity());
//        StringBuilder sb1 = new StringBuilder(5);
//        System.out.println(sb1.capacity());


//          StringTokenizer class in Java

        StringTokenizer st = new StringTokenizer("This is Jithu!");
        StringTokenizer st1 = new StringTokenizer("");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextElement());
//        }


//        System.out.println(st.nextElement());
//        System.out.println(st.countTokens());
//        System.out.println(st.hasMoreElements());
//        System.out.println(st1.hasMoreElements());
//        System.out.println(st.nextToken(" "));
//        System.out.println(st.equals(st1));
//        System.out.println(st.hashCode());
//        System.out.println(st.hasMoreTokens());









    }
}