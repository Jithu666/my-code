import java.util.Scanner;

class main90 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ca = sc.nextLine();
//        String line = "this website is aw3som3";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        ca = ca.toLowerCase();
        for (int i = 0; i < ca.length(); ++i) {
            char ch = ca.charAt(i);
            if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                ++vowels;
            }
        else if ( ch >='a' && ch <= 'z'){
                ++consonants;
            }
        else if (ch >= '0' && ch <= '9') {
                ++digits;
            } else if ( ch == ' '){
                ++spaces;
            }
        }
        System.out.println("vowels = " + vowels);
        System.out.println("consonants = " + consonants);
        System.out.println("digits = " + digits);
        System.out.println("white spaces = " +spaces);
    }
}
