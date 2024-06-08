public class isArray_Sorted {
    public static void main(String[] args) {
//
        int a[] = {5, 3, 4, 5, 6, 7, 8, 9};
//
//        int first_ele = a[0];
//
//        boolean flag = false;
//        for(int i = 0; i < a.length; i++){
//            if(a[i] >= first_ele){
//                i++;
//                first_ele++;
//                flag = true;
//            }
//        }
//        if(flag == true){
//            System.out.println("Array is sorted in non-descending order");
//        }
//        System.out.println("Array is not sorted in non-descending order");

        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i] > a[i+1]){
                count++;
            }
        }

        if(count == 0)
            System.out.println("true");

        else if (count > 1)
            System.out.println("False");

        else if(a[0] > a.length-1)
            System.out.println("True");

        else
            System.out.println("False");
    }
}
