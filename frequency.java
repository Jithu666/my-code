public class frequency {
    public static void main(String[] args) {
        String str = "This website is awesome";
        char ch = 's';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i)){
                ++frequency;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
