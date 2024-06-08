import java.util.Arrays;

public class LeftRotateThe_Array {
    public static void main(String[] args) {

        int arr[] = {3,4,5,6,7,8,9,10};

        int first_idx = arr[0];
        int last_idx = arr.length;

        for(int i = 1; i < last_idx; i++){
            arr[i-1] = arr[i];
        }
        arr[last_idx-1] = first_idx;

        System.out.println(Arrays.toString(arr));

    }
}
