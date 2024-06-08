public class bubbleSort {
    public static void main(String[] args) {

        int arr[] = {6,4,5,3,7,2,8,1,9};

        bubbleSort(arr);

        System.out.print("Sorted array is : ");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0; i < len-1; i++){
            for(int j = 0; j < len-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
    }
}
