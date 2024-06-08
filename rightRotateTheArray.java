public class rightRotateTheArray {
    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,1,2};
        int k = 2;

        rotate(arr, k);
    }
    public static void rotate(int arr[], int k){
        k = k % arr.length;

        if(k < 0)
            k += arr.length;

        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }

    public static void reverse(int arr[], int i, int j){
        int li = i;
        int right_idx = j;

        while(li < right_idx){
            int temp = arr[li];
            arr[li] = arr[right_idx];
            arr[right_idx] = temp;

            li++;
            right_idx--;
        }


        for(int k = 0; i < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
