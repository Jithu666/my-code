public class rmLeadingZeroes {
    public static void main(String[] args) {
        String str = "00705";
        String res = rmLeadingZeroes(str);
        System.out.println(res);
    }
    static String rmLeadingZeroes(String str){
        int n = str.length();
        int i = 0;
        while(str.charAt(i) == '0' && i < n) {
            i++;
        }
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0,i, "");
        return sb.toString();
    }
}
