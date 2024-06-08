public class StringReplace {
    public static void main(String[] args) {
        String s = "Githendra";
        char ch = 'J';
        stringreplace(s, ch);
    }
    static void stringreplace(String s, char ch){
        int n = s.length();
        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb);
        sb.replace(0, 1, String.valueOf(ch));
        System.out.println(sb);
    }
}
