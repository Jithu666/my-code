public class new_Project{
    public static void main(String[] args) {

        int a[] = {1,3,4,5,7,2};
        int n = a.length + 1;

        int sum = (n*(n+1))/2;

        int missingNumber = 0;

        for(int i = 0; i < a.length; i++){
            sum -= a[i];
        }
        missingNumber = sum;
        System.out.println("The missing Number is : " + missingNumber);
    }
}