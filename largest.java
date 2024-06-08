public class largest {
    public static void main(String[] args) {

        double[] numArray = { 10, 19, 18, 17,16, 15, 14, 13, 12, 11};
        double largest = numArray[0];

        for(double num: numArray){
            if (largest < num)
                largest = num;
        }
        System.out.printf("largest element = %.2f", largest);
    }
}
