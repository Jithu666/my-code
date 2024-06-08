public class insertionSort {
    public static void main(String[] args) {

        int arr[] = {9,8,7,6,5,4,3,2,1,0};

        System.out.print("Original Array before Insertion sort : ");
        printArr(arr);

        insertionSort(arr);

        System.out.print("Array after Insertion sort : ");
        printArr(arr);

    }
    static void insertionSort(int arr[]){
        int len = arr.length;
        for(int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    static void printArr(int arr[]){
        int len = arr.length;

        for(int i = 0; i < len; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
