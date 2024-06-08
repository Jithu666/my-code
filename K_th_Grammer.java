public class K_th_Grammer {
    public static void main(String[] args) {

        int n = 3;
        int k = 2;

        int resultVariable = K_th_Grammer(n,k);

        System.out.print("The element at index k is : " + resultVariable);
    }

    public static int K_th_Grammer(int n, int k){

        if(n == 1 && k == 1){
            return 0;
        }

        int mid = (int)Math.pow(2, n-1)/2;
        if(k <= mid)
           return K_th_Grammer(n-1, k);

        else
            return 1 - K_th_Grammer(n-1, k-mid);
    }

}
