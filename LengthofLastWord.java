public class LengthofLastWord {
    public static void main(String[] args) {

        String s = "Jithendra Gowda";

        int len = lenOfLastWord(s);
        System.out.println(len);
    }
    public static int lenOfLastWord(String s) {
        int l = s.length();
        s = s.trim();
        int length = 0;
        for (int i = l-1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return length;
            }
        length++;
    }
        return length;
    }
}
