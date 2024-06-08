import java.util.HashMap;
import java.util.Map;

public class findFrequencies {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,6,6,7,8,8,5,6,9};
        int n = arr.length;
        findFrequencies(arr, n);
    }
    public static void findFrequencies(int []arr, int n){
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
