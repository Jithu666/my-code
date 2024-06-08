import java.util.Arrays;

class anagrams{
    public static void main(String[] args) {
        char str1[] = {'j', 'i', 't', 'h', 'u'};
        char str2[] = {'j', 'i', 'g', 'h', 'u'};

        if(isAnagram(str2, str1)){
            System.out.println("String1 and String2 are Anagrams!");
        }else
            System.out.println("String1 a nd String2 are Not-Anagrams!");
    }// end of main method

    static boolean isAnagram(char str1[], char str2[]){

        boolean flag = false;

        int m = str1.length;
        int n = str2.length;

        if(m != n)
            return false;

        Arrays.sort(str2);
        Arrays.sort(str1);

        for(int i = 0; i < n; i++) {
            if (str1[i] != str2[i])
                return false;
        }
        return true;
    }
}