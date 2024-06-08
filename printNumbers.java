public class printNumbers {
    public static void printNumbers(int i, int n){
        if (i < 1)
            return;

        printNumbers(i-1, n);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int i = 1;
//        int n = 18
        printNumbers(17, 17);
    }
}
