
public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {6,66,666,6666,66696,0};
        int key = 69;

        boolean flag = false;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == key) {
                flag = true;
                System.out.println(i);
            }
        }

//        if(flag == true)
//            System.out.println(i);
//        else
        if(flag == false) {
            System.out.println("Element not found in the array");
        }
    }
}
