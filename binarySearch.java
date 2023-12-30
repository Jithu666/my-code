public class binarySearch {
    public static void main(String[] args) {

        int arr[] = {1,3,4,5,6,7,8,9,10};
        int value = 4;
        int size = arr.length;

        int posn = binarySearch(arr, 0, size-1, value);

        if(posn == -1){
            System.out.println("element not found");
        }else{
            System.out.println("Element " + value + " found at " + posn);
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int value) {

//      RECURSIVE APPROACH

//        if (high >= low) {
//            int mid = (high - low) / 2 + low;

//            if (arr[mid] == value)
//                return mid + 1;

//            if (arr[mid] > value)
//                return binarySearch(arr, 0, mid - 1, value);

//            else
//                return binarySearch(arr, mid + 1, high, value);
//        } else
//            return -1;

//        ITERATIVE APPROACH

        while(low <= high){

            int mid = (high-low)/2 + low;

            if(arr[mid] == value)
                return mid;

            if(arr[mid] > value)
                high = mid-1;

            else
                low = mid+1;
        }
        return -1;
    }
}
