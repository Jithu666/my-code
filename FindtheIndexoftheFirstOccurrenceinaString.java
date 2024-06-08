public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String a = "Jithendra";
        String b = "z";
        int find_occurance = findFirstOccurence(a, b);
        System.out.println(find_occurance);
    }

    public static int findFirstOccurence(String a, String b){
//        if(a.contains(b)){
//            return true;
//        }else {
//            return false;
//        }
        return a.indexOf(b);
    }
}
