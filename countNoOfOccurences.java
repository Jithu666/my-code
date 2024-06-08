
public class countNoOfOccurences {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,0,1,2,1,2,1,};

        int element = 2;

        int var = countOccurences(arr, element, 0);

        System.out.println("The number of occurences of " + element + " is : " + var);
    }

    public static int countOccurences(int arr[], int element, int index){

        if(index == arr.length){
            return 0;
        }
        if(arr[index] == element){
            return 1 + countOccurences(arr, element, index+1);
        }else{
            return countOccurences(arr, element, index+1);
        }
    }
}
