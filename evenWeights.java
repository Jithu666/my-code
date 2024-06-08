public class evenWeights {
    public static void main(String[] args) {

        String str[] = {"Hi", "Hello", "This", "is", "Jithendra"};
        int n = str.length;
        evenWeight(str, n);
    }

    public static void evenWeight(String str[], int n){

        String evenLenWord = "";
        for(int i = 0; i < n; i++){
            int temp = str[i].length();
//            System.out.println(temp);
            if (temp % 2 == 0){
                evenLenWord = str[i];
                System.out.println(evenLenWord);
            }
        }
    }
}
