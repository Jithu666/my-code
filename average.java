public class average {
    public static void main(String[] args) {
        double[] numArray = {12, 23,34,45,56,78,89,90};
        double sum = 0.0;
        for(double num: numArray){
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.printf("the average is : % .2f",average);
    }
}
