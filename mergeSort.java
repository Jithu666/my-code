public class mergeSort {

    static void displayArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;

        for (i = 0; i < n1; i++)
            left[i] = arr[low + i];
        for (j = 0; j < n2; j++)
            right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = low;

        while (i < n1 && j < n2) {
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }


    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int n = arr.length;
        System.out.print("Array before Merge Sort :");
        displayArr(arr);
        mergeSort(arr, 0, n - 1);
        System.out.print("\n Array after Merge Sort : ");
        displayArr(arr);
    }
}
