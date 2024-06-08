//import java.sql.SQLOutput;

public class Pattern_matching {

     static int isSubstring(String s1, String s2) {
         int l1 = s1.length();
         int l2 = s2.length();

         int j = 0;
         for (int i = 0; i < l2 - l1; i++) {
             for (j = 0; j < l1; j++)
                 if (s2.charAt(i + j) != s1.charAt(j))
                     break;


             if (j == l1)
                 return i;
         }
         return -1;
     }




    public static void main(String[] args) {

        String s1 = "Geeks";
        String s2 = "GeeksforGeeks";

        int value = isSubstring(s1, s2);

        if (value == -1)
            System.out.print("Pattern Match not Found !");
        else
            System.out.println("Pattern Match found at location " + value);


    }
}
