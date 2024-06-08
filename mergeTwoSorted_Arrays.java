public class mergeTwoSorted_Arrays {
    public static void main(String[] args) {

        int a1[] = {1,2,3};
        int a2[] = {4,5,6};
        int m = a1.length-1;
        int n = a2.length-1;

        merge(a1, m, a2, n);
    }

    static void merge(int a1[], int m, int a2[], int n){
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0){
            if(i >= 0 && a1[i] > a2[j])
                a1[k--] = a1[i--];
            else
                a1[k--] = a2[j--];
        }
//        System.out.println(a1[k]);
    }
}
