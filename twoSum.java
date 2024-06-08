import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int target = 7;

        int[] result = twoSum(arr, target);
        if(result != null)
            System.out.print("Indexes are [" + result[0] + "," + result[1] + "]");
        else
            System.out.println("Pair not found!");
    }

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> idx = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int complement = target-arr[i];
            if(idx.containsKey(complement)){
                return new int[]{idx.get(complement), i};
            }
            idx.put(arr[i], i);
        }return null;
    }
}
