import java.util.Arrays;
public class rearrangeArray {
   public static void rearrangeArrayAlternately(int[] arr){
        int n = arr.length;
        int left = 0; int right = n-1;
        int idx = 0;
        int result[] = new int[n];
        
     while(left <= right){
         if(idx % 2 == 0) {
             result[idx] = arr[right];
             right--;
         }else{
             result[idx] = arr[left];
             left++;
         }
        idx++;
     }
        System.arraycopy(result, 0, arr, 0, n);
}
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original Array : " + Arrays.toString(arr));
        rearrangeArrayAlternately(arr);
        System.out.println("Rearranged array : " + Arrays.toString(arr));
    }
}
