public class addBinary {
    public static void main(String[] args) {

        String a = "1001";
        String b = "101";
        String res = addBinary(a, b);
        System.out.println(res);
    }

    public static String addBinary(String a, String b){

        int n1 = Integer.parseInt(a,2);
        int n2 = Integer.parseInt(b, 2);

        int res = n1 + n2;

        return Integer.toBinaryString(res);
    }
}
