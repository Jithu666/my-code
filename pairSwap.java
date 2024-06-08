public class pairSwap {
    public static void main(String[] args) {
        String s = "boAt";

        String swappedString = pairSwap(s);
        System.out.println(swappedString);

    }
    static String pairSwap(String s){
        if(s.isEmpty() || s == null)
            return s;

        char []ch = s.toCharArray();

        for(int i = 0; i < s.length()-1; i+=2){
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }
        return new String(ch);
    }
}
