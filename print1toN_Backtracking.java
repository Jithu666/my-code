public class print1toN_Backtracking {
    public static void main(String[] args) {

        int n = 6;
        BackTracking(1, n);
    }

    static void BackTracking(int n, int i){


        if(n > i)
            return;

        BackTracking(n+1, i);
        System.out.print(n + " ");

    }
}
