public class printAllDivisors {
    public static void main(String[] args) {

        int num = 5;

        allDivisors(num);
    }

    public static void allDivisors(int num){

        int val = (num/2)+1;
        for(int i = 1; i < val; i++){
            if(num%i==0)
                System.out.print(i + " ");
        }
        System.out.println(num);
    }
}
