import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {

        String a = "efghabcd";
        sortString(a);
    }
    static void sortString(String str){
        int n = str.length();

        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
