public class swapStringPairs {
    public static void main(String[] args) {
        String str = "Jithendra";

        String resString = swapStringPairs(str);
        System.out.println(resString);
    }
    static String swapStringPairs(String str){

        if(str == null || str.isEmpty())
            return str;

        int n = str.length();

        StringBuilder sb = new StringBuilder(n);

        for(int i = 0; i < str.length() - 1; i += 2){
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i));
        }

        if(n % 2 != 0){
            sb.append(str.charAt(n-1));
        }
        return new String(sb);
    }
}
