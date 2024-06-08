public class reversString {
    public static void main(String[] args) {
        String s = "Jithendra";

//        StringBuffer sb = new StringBuffer(s);
//        System.out.println(sb.reverse());


        for (int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }

    }
}
