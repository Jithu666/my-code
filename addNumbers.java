public class addNumbers {
    public static void main(String[] args) {
        int number = 6;
        int sum = addNumbers(number);
        System.out.println("sum = " + sum);
    }
    public static int addNumbers(int num){
        if (num != 0)
            return num + addNumbers(num-1);
        else
            return num;
    }
}
