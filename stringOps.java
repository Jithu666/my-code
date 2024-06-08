public class stringOps {
    public static void main(String[] args) {

        String str = "Jithendra K R";
        ops(str);
    }
    static void ops(String str){
//        System.out.println(str.indexOf("K"));
        StringBuffer sb = new StringBuffer(str);
        sb.insert(9, " Gowda");
        System.out.println(sb);
    }
}
