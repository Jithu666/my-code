public class MaximumSubArraySum {
    public static void main(String[] args) {

        int arr[] = {23, 45, 96, 109, 123, 230};
        int k = 4;

        int result = corrupted(arr, k);
        System.out.println("The Maximum Sub array sum is : " + result);
    }

    public static int corrupted(int[] nums, int k){

        int size = nums.length;

        if(size < k){
            System.out.println("Invalid size of the Array! ");
            return -1;
        }

        int max_Sub_ArraySum = 0;

        for(int i = 0; i < k; i++){
            max_Sub_ArraySum += nums[i];
        }

        int windowSum = max_Sub_ArraySum;

        for(int i = 0; i < size - k; i++){
            max_Sub_ArraySum -= nums[i];
            max_Sub_ArraySum += nums[i + k];
            windowSum = Math.max(max_Sub_ArraySum, windowSum);
        }
        return windowSum;
    }
}
