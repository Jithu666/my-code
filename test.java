class test{
    public static void main(String[] args) {

        int size  = 5;
        int alpha = 67;
        int num = 0;
        for(int i = 1; i <= size; i++){
            for(int j = size; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i *2 - 1; j++){
                System.out.print((char)(alpha+num++));
            }
            num = 0;
            System.out.println();
        }
        for(int i = 1; i <= size - 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = (size - i) * 2 - 1; j > 0; j--){
                System.out.print((char)(alpha+num++));
            }
            num  = 0;
            System.out.println();
        }
    }

    public static class target_1 {
        public static void reverse(int[] a , int n) {
            int temp = 0;
            int i = 0, j = n - 1;
            while (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
            public static void main(String[] args){
                int a[] = {1,2,3,4,5};
                System.out.println("Original array");
                for(int i = 0; i < a.length; i++){
                    System.out.println(a[i] + " ");
                }
                System.out.println(" ");
                int n = a.length;
                reverse(a,n);
                System.out.println("reversed array");
                for(int i = 0; i < a.length; i++){
                    System.out.print(a[i] + " ");
                }
            }
        }
}