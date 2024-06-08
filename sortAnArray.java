public class sortAnArray {
    public static void main(String[] args) {

        int arr[] = {9,0,8,1,2,3,7,6,4,5};

//        ARRAY BEFORE MERGE SORT OPERATION IS BEEN PERFORMED
        System.out.print("Original Array is : ");
        printArray(arr);

        mergeSort(arr, 0, arr.length-1);

//        ARRAY AFTER MERGE SORT OPERATION HAS BEEN PERFORMED
        System.out.print("Array after merge-sort operation been performed is : ");
        printArray(arr);
    }

//    END OF MAIN METHOD

//    MERGE SORT RECURSIVE CALL STACK

    public static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {
            int mid = (high - low) / 2 + low;


            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }
//    END OF MERGE-SORT METHOD

    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low +1;
        int n2  = high - mid;

        int[] leftArray = new int [n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[low+i];
        }

        for(int j = 0; j < n2; j++){
            rightArray[j] = arr[mid+1+j];
        }

        int i = 0, j = 0;
        int k = low;

        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
