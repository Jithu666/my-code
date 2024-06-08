
public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int arr[] = {1,0,1,1,1,1};

        int result = maxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive One's in the arr are : " + result);
    }
    public static int maxConsecutiveOnes(int arr[]) {
//        int size = arr.length;
        int count = 0;
        int max_countOfOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max_countOfOne = Math.max(max_countOfOne, count);
        }
        return max_countOfOne;
    }
}
