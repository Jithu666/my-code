
public class selectionSort extends insertionSort{
    public static void main(String[] args) {

        int arr[] = {9,8,7,6,5,4,3,2,1};

        System.out.print("Original Array : ");
        printArr(arr);

        selectionSort(arr);

        System.out.print("Sorted Array : ");
        printArr(arr);
    }
    static void selectionSort(int arr[]){

        int len = arr.length;
        for(int i = 0; i < len -1 ; ++i) {
            int min = i;

            for(int j = i + 1; j < len; j++)
                if(arr[j] < arr[min])
                    min = j;

            int temp = arr[min];
            arr[min]= arr[i];
            arr[i] = temp;

        } // end of for loop
    } // end of main
}
