import java.math.*;
public class missingNOinArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        boolean act_value = missingNo(arr);
        if(act_value == true)
            System.out.println("Has Missing value");
        else
            System.out.println("No Missing value");
    }
    public static boolean missingNo(int[] arr){
        int n = arr.length;
        int act_value = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        System.out.println(act_value);
        int complement = act_value-sum;
        System.out.println(complement);
        if(complement > 0)
            return true;
        else
            return false;
    }
}
