public class displayLongestName {
    public static void main(String[] args) {

        String str[] = {"Jithu", "Gowda", "Jithendra"};
        int n = str.length;
        String res = longestName(str, n);
        System.out.println("Longest Word in the String is : " + res);
    }

    public static String longestName(String str[], int n){
        String maxLenWord = "";
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int curLen = str[i].length();
            System.out.println(curLen);
            if(curLen > maxLen){
                maxLen = curLen;
                maxLenWord = str[i];
            }
        }
        return maxLenWord;
    }
}
