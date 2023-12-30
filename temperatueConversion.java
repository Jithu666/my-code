import java.util.*;
public class temperatueConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in celcius");
        int temp = sc.nextInt();

//        for(String temp : args){
//            System.out.println(temp);
//        }


//        farhenheitToCelcius(temp);
//        celciusToFarhenheit(temp);
    }

   public static void farhenheitToCelcius(int farhenheit){
        int celcius = ((farhenheit - 32)*5)/9;
        System.out.println("The Temperature " + farhenheit + " in celcius is " + celcius);
    }

   public static void celciusToFarhenheit(int temp){
        int farhenheit = ((9*temp)/5)+32;
       System.out.println("The Temperature " + temp + " in celcius is " + farhenheit);

   }

}
