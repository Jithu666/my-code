public class LongestCommonPrefix {
    public static String lcp(String[] s) {

        if (s == null || s.length == 0) {
            return "";
        }

        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            String curString = s[i];

            int j = 0;
            while (j < prefix.length() && j < curString.length() && prefix.charAt(j) == curString.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "";
            }
            prefix = prefix.substring(0, j);
        }

        return prefix;
    }

    public static void main(String[] args){
    String[] s = {"Githu", "Githendra", "Githendra gowda"};
    String lcp = lcp(s);
    System.out.println(lcp);
    }
}
