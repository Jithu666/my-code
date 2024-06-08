
public class reverseArray {
    public static void main(String[] args) {

        System.out.print("Original Array :");
        int arr[] = {6,5,4,3,2,1,7,8,9,0};

        reverseArray(arr, 0, arr.length-1);

        System.out.print("Reversed Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[], int idx, int last_idx) {

        if (idx < last_idx) {
            int temp = arr[idx];
            arr[idx] = arr[last_idx];
            arr[last_idx] = temp;

            reverseArray(arr, idx + 1, last_idx - 1);
        }
    }
}
