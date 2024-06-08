import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.util.*;
import javax.swing.JOptionPane;



public class Main {

    public static void main(String[] args) {
//        int a = 6;
//        int b = 7;
//        int temp;
//
//        temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a);
//        System.out.println(b);
////        System.out.println(temp);
//
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hey there! Enter you Name  ");
//        String name = sc.nextLine();
//        System.out.println("Please enter your age");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Mention your fav food");
//        String fav_food = sc.nextLine();
//
//        System.out.println("Hello " + name + " you are " + age + " you like " + fav_food);

//        operators
//        int num = 6;
//        num = num + 8;
//        num +=9;
//        num = num * 9;
//        num -= 120;
//
//        System.out.println(num);


//      GUI

//        String name = JOptionPane.showInputDialog("Enter your name");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Ente you height"));
//
//        JOptionPane.showMessageDialog(null, "Hello " + name + " you are " + age + "You are " + height + " feet tall");

//        JOptionPane.showMessageDialog(null, "you are " + age);


//        MATH METHODS

//        double a = 3.14;
//        double b = -2.1314;

//        System.out.println(Math.min(a, b));
//        System.out.println(Math.max(a, b));
//        System.out.println(Math.abs(b));
//        System.out.println((int)Math.sqrt(16));
//        System.out.println(Math.round(a));
//        System.out.println(Math.ceil(a));
//        System.out.println(Math.floor(b));
//        System.out.println(Math.random());


//        FIND HYPOTHENEUS OF A TRIANGLE

//        System.out.println("Enter base value");
//        double base = sc.nextDouble();
//        System.out.println("Enter height value");
//        double height = sc.nextDouble();
//        double hypotheneus;
//
//        hypotheneus = Math.sqrt((base*base)+(height*height));
//        System.out.println("hypothesis is " + hypotheneus);

//      PRINTING A PSEUDORANDOM NUMBER

//        Random rn = new Random();
//        int x = rn.nextInt(5);
//        double a = rn.nextDouble();
//        boolean b = rn.nextBoolean();
//        System.out.println(x);


//        IF ELSE STATEMENTS
//          int age = 12;
//
//          if(age >= 21){
//              System.out.println("You are eligible for a Driver's liesence");
//          } else if (age>18 && age <21) {
//              System.out.println("You are eligible for a learners liesence");
//          } else{
//              System.out.println("You are not eligible for a drivers liesence");
//          }

//          SWITCH CASE STATEMENTS
//        String day = "Jithu";
//
//        switch (day){
//            case "Monday" :
//                System.out.println("Today is Monday");
//                break;
//            case "Tuesday" :
//                System.out.println("Today is Tuesday");
//                break;
//            case "Wednesday" :
//                System.out.println("Today is Wednesday");
//                break;
//            case "Thursday" :
//                System.out.println("Today is Thursday");
//                break;
//            case "Friday" :
//                System.out.println("Today is Friday");
//                break;
//            case "Saturday" :
//                System.out.println("Today is Saturday");
//                break;
//            case "Sunday" :
//                System.out.println("Today is Sunday");
//                break;
//            default:
//                System.out.println("That is not a valid day!");
//        }

//        LOGICAL OPERATORS

//      AND OPERATOR

//        char c = '!';
//
//        if(c >= 'A' && c <= 'Z')
//            System.out.println("The entered character is capital");
//        else if( c >= 'a' && c <= 'z')
//            System.out.println("The entered character is lowercase");
//        else
//            System.out.println("The character you have entered is not a letter");


//        OR OPERATOR

//        int age = 19;
//        boolean isStudent = false;
//
//        if(isStudent || age < 18){
//            System.out.println("You get a discount on shopping");
//        }else{
//            System.out.println("You are not eligible for any discounts");
//        }

//        char input = sc.next().charAt(0);
//
//        if(input == 'G' || input == 'J'){
//            System.out.println("you entered a character");
//        }else
//            System.out.println("invalid character");

//          NOT OPERATOR


//        boolean a = true;
//        if(!a){
//            System.out.println("My name is Jithu");
//        }else{
//            System.out.println("Hi Jithu");
//        }


//        WHILE LOOPS IN JAVA

//        int idx = 5;
//
//        while (idx == 5){
//            System.out.println("hi Jithu");
//            idx--;
//        }

//        String name = "";
//
//        while(name.isBlank()){
//            System.out.print("Enter your name : ");
//            name = sc.nextLine();
//        }
//        System.out.println("Hello " + name);
//


//        FOR LOOPS IN JAVA

//        for (int i = 0; i < 6; i++){
//            System.out.println("This is " + i + "th iteration");
//        }

//      NESTED FOR LOOPS

//        System.out.println("Enter the number of rows");
//        int row = sc.nextInt();
//        System.out.println("Enter the number of column");
//        int column = sc.nextInt();

//        System.out.println("Enter Symbol");
//        String symbol = sc.next();


//        for(int i = 0; i < row; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.print("\n");
//        }


//        ARRAYS

//        String cars[] = {"DBX 707", "Urus", "performante", "G-Wagon", "Mini-Cooper"};

//        String cars[] = new String[5];
//        cars[0] = "DBX 707";
//        cars[1] = "Urus";
//        cars[2] = "performante";
//        cars[3] = "G-Wagon";
//        cars[4] = "Mini-Cooper";

//        cars[4] = "F-pace";


//        for (int i = 0; i < cars.length; i++){
//            System.out.println(cars[i]);
//        }

//          2 D ARRAYS

//        String cars[][] = new String[3][4];
//
//        cars[0][0] = "Defender";
//        cars[0][1] = "Sport";
//        cars[0][2] = "Discovery";
//        cars[0][3] = "Vogue";
//
//        cars[1][0] = "Harrier";
//        cars[1][1] = "Nexon";
//        cars[1][2] = "Civic";
//        cars[1][3] = "Dodge-Challenger";
//
//        cars[2][0] = "Fortuner";
//        cars[2][1] = "Endevour";
//        cars[2][2] = "XUV 7OO";
//        cars[2][3] = "Scorpio-N";
//
//        int len = cars.length;
//        System.out.println(len);
//
//        for(int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.print(cars[i][j] + " ");
//            }
//            System.out.println();
//        }
//

//        STRING METHODS

//        String name = "Jithendra";
//
//        System.out.println(name.length());
//        System.out.println(name.isBlank());
//        System.out.println(name.charAt(8));
//        System.out.println(name.toUpperCase());
//        System.out.println(name.equals("JITHU"));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.getBytes(StandardCharsets.UTF_8));
//        System.out.println(name.compareTo("JITHENDRA"));
//        System.out.println(name.concat(" Gowda"));
//        System.out.println(name.contains("ia"));
//        System.out.println(name.indexOf("n"));
//
//
//          WRAPPER CLASSES IN JAVA

//        Integer a = 6;
//        Double d = 9.00345;
//        Character c = '!';
//        Boolean b = false;
//        Float f = 3.1415f;
//
//        System.out.println(b);
//        System.out.println(f);


//        ARRAYLISTS

//        ArrayList<String> al = new ArrayList<>();

//        al.add("Burger");
//        al.add("Fried Chicken");
//        al.add("Pasta");
//        al.add("Sandwich");
//        al.add("Noodles");
//        al.add("Chicken wings");
//        al.add("Sheik Rolls");
//        al.add("Paneer");
//        al.add("Chole Bature");
//        al.add("Egg Burji");
//
//        System.out.println(al.size());
///        System.out.println(al.contains("Egg Burji"));
//        System.out.println(al.remove(8));
//        System.out.println(al.isEmpty());
//        System.out.println(al.removeAll());


//        for(int i = 0; i < al.size(); i++){
//            System.out.println(al.get(i));
//            System.out.println();
//        }


//          2 D ARRAYLIST

//        ArrayList<ArrayList<String>> WatchList = new ArrayList<>();

//        ArrayList<String> W1 = new ArrayList<>();
//        W1.add("Eicher Motors");
//        W1.add("Britannia");
//        W1.add("Bajaj Auto");
//        W1.add("Cams");
//        W1.add("SBCL");

//        ArrayList<String> W2 = new ArrayList<>();
//        W2.add("AWL");
//        W2.add("ONGC");
//        W2.add("BPCL");
//        W2.add("IOC");
//        W2.add("HINDALCO");
//        W2.add("CRISIL");
//        W2.add("TATA POWER");
//        W2.add("TATA COFFEE");
//        W2.add("VEDANTA");
//        W2.add("KESORAM");

//        ArrayList<String> W3 = new ArrayList<>();
//        W3.add("SUN PHARMA");
//        W3.add("Mc-DOWELL");
//        W3.add("TRIDENT");
//        W3.add("MARICO");
//        W3.add("EMAMI");
//
//        WatchList.add(W1);
//        WatchList.add(W2);
//        WatchList.add(W3);
//
//        System.out.println(WatchList);
//

//          FOR EACH LOOP

//        int num[] = {1,2,3,4,5,6,7,8,5,4,3,2,1,9};
//
//        for (int i : num) {
//            System.out.print(i + " ");
//        }

//        String name = "";
//        hello(name);
//        int a = 6;
//        int b = 0;
//        int c = 0;
//
//        int res = add(a, b);
//        int sum = add(a, b, c);
//
//        System.out.println("The sum of " + a + "+" + b + " are :" + res);
//        System.out.println("The sum of " + a + "+" + b + "and " + c + " are :" + sum);

//
//

//        METHODS
//              A METHOD IS A BLOCK OF CODE WHICH IS EXECUTED WHENEVER IT IS CALLED


//    static void hello(String name){
//        System.out.println("Enter your name");
//        Scanner sc = new Scanner(System.in);
//        name = sc.nextLine();
//        System.out.println("Hello " + name);

//    static void add(int a, int b) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a");
//        a = sc.nextInt();
//        System.out.println("Enter the value of b");
//        b = sc.nextInt();
//
//        int result = a+b;
//        System.out.println("The Addition of " + a + " and " + b + " is " + result);
//    }

//    OVERLOADING METHODS
//                    METHODS SHARE THE SAME NAME BUT HAVE DIFFERENT PARAMETERS
//                      METHOD NAME + PARAMETER = METHOD SIGNATURE

//        static int add(int a, int b){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the value of a:");
//            a = sc.nextInt();
//            System.out.println("Enter the value of b:");
//            b = sc.nextInt();
//            return a + b;
//        }
//
//        static double add(double a, double b){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the value of a:");
//            a = sc.nextDouble();
//            System.out.println("Enter the value of b:");
//            b = sc.nextDouble();
//            return a + b;
//        }
//
//    static int add(int a, int b, int c){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of a:");
//        a = sc.nextInt();
//        System.out.println("Enter the value of b:");
//        b = sc.nextInt();
//        System.out.println("Enter the value of c:");
//        c = sc.nextInt();
//        return a + b + c;
//    }


//      PRINTF FORMAT SPECIFIER
//                AN OPTIONAL METHOD TO CONTROL, FORMAT AND DISPLAY TEXT ON TO THE CONSOLE WINDOW
//                    PRINTF HAS TWO PARTS FORMAT STRING AND THE OBJECT/VARIABLE/VALUE

//        PRINTF CAN CONTAIN 3 FUNCTIONS
//        1) FLAG
//        2) WIDTH
//        3) PRECISION

//        System.out.printf("This %d is a format %d string %-20s", a, 7, "Jithu");


//        FINAL KEYWORD

//        final float PI = 3.1415f;

//        System.out.println(PI);


//        OBJECT ORIENTED PROGRAMMING

//        OBJECTS An instance of the class that may contain attributes and methods

//        book bk = new book();
//        System.out.println(bk.author);
//        System.out.println(bk.distributor);
//        System.out.println(bk.price);
//        System.out.println(bk.subject);
//        System.out.println(bk.publisher);
//
//        bk.read();
//        bk.promote();

//      CONSTRUCTORS IN JAVA
//            IS A SPECIAL METHOD THAT IS CALLED WHEN A OBJECT IS INSTANCIATED (CREATED)

//        book bk = new book("Reasoning", 660, "Pearson", "Arun Sharma");
//        book bk1 = new book("Verbal and reading comprehension", 810, "Pearson", "Arun Sharma");


//        System.out.println("The book is on " + bk.subject);
//        System.out.println("The book is on " + bk.author);
//        System.out.println("The book is on " + bk1.subject);
//
//        bk.print1();
//
//        bk1.print1();

//        bk.read();
//        bk1.read();


//        LOCAL AND GLOBAL VARIABLES IN JAVA

//        LOCAL VARIABLE :: VARIABLES WHICH ARE DECLARED INSIDE THE METHODS AND ARE VISIBLE ONLY WITHIN THE METHOD

//        GLOBAL VARIABLE :: VARIABLES WHICH ARE DECLARED OUTSIDE THE METHODS, BUT DECLARED WITHIN THE CLASS AND CAN BE ACCESSED FROM ANYWHERE

//    book bk = new book();
//    bk.read();

//        OVERLOADED CONSTRUCTORS

//       book bk = new book("Jithendra", "Reasoning", "Skyline", 790);
//        System.out.println(bk.subject);
//        System.out.println(bk.name);
//        System.out.println(bk.distributor);
//        System.out.println(bk.price);
//        System.out.println("\n");
//
//        book bk1 = new book("Bro", "Aptitude", 1200);
//        System.out.println(bk1.price);
//        System.out.println(bk1.name);
//        System.out.println(bk1.subject);
//
//      OBJECT PASSING

//        publish ps = new publish();
//        book bk = new book("Verbal Ability");
//        book bk1 = new book(400, "Data Interpretation");
//        ps.print(bk);
//        ps.publish(bk1);


//        STATIC KEYWORD


//        STATIC : IS A MODIFIER, A SINGLE COPY OF METHOD/VARIABLE IS CREATED AND SHARED
//            THE CLASS OWNS THE STATIC MEMBER

//        IF YOU DECLARE ANY VARIABLE OR METHOD AS STATIC, THEN YOU NEED NOT CREATE OBJECT TO CALL THAT METHOD

//        book bk = new book("Logical Reasoning");
//        book bk1 = new book("Verbal Ability");
//        book bk2 = new book("Data Interpretation");
//        book bk3 = new book("Quantitative Aptitude");

//        System.out.println("The number of copies of the book are : " + book.copies);
//        System.out.println(bk.subject);
//        System.out.println(bk1.subject);
//        System.out.println(bk2.subject);
//        System.out.println(bk3.subject);

//        book.displayBooks();


//        INHERITANCE

//        IS THE PROCESS WHERE ONE CLASS ACQUIRES THE ATTRIBUTES AND METHODS OF OTHER CLASS
//            distribute dis = new distribute();
//            publish pbh = new publish();
//            pbh.displayBooks();
//            dis.sell();
//        System.out.println(dis.copies);
//        System.out.println(pbh.copies);


//      METHOD OVERRIDING
//            DECLARING A METHOD IN SUB-CLASS, WHICH IS ALREADY PRESEENT IN THE PARENT CLASS
//            AND THIS IS DONE SO THAT A CHILD CLASS CAN HAVE ITS OWN IMPLEMENTATION


//        book bk = new book();
//        bk.implement();
//        distribute dis = new distribute();
//        dis.implement();

//        SUPER KEYWORD : REFERS TO THE SUPERCLASS (PARENT) OF AN OBJECT
//                  IT IS VERY SIMILAR TO THIS KEYWORD


//        distribute dis = new distribute("Quants", 290, 210);
//        distribute dist = new distribute("Logical Reasonong", 600, 550);

//        System.out.println(dist.subject);
//        System.out.println(dist.copies);
//        System.out.println(dist.copiesMade);

//        System.out.println(dist.toString());


//        ABSTRACT CLASS: ABSTRACT CLASSES CANNOT BE INSTANTIATED, BUT THEY CAN HAVE A SUB-CLASS
//                            ABSTRACT METHODS ARE DECLARED WITHOUT AN IMPLEMENTATION

//        distribute dis = new distribute();
//        dis.print();


//      ACCESS MODIFIERS IN JAVA
//                          ACCESS MODIFIERS ADD A LAYER OF SECURITY TO OUR PROGRAMS
//                          there are 4 access modifiers
//                            1) public
//                            2) protected
//                            3) default
//                            4) private

//          ENCAPSULATION : THE CONCEPT OF ATTRIBUTES OF A CLASS BEING PRIVATE OR HIDDEN
//                          CAN BE ACCESSED ONLY THROUGH SPECIAL METHODS CALLED (GETTERS AND SETTERS)


//            book bk =  new book("Quantitative Aptitude", "Arun Sharma",  1099);
//            book bk1 = new book("Data Interpretation", "RS Agarwal", 1239);

//        System.out.println(bk.getSubject());
//        System.out.println(bk.getAuthor());
//        System.out.println(bk.getPublisher());
//        System.out.println(bk.getDistributor());
//        System.out.println(bk.getPrice());


//        System.out.println(bk1.getSubject());
//        System.out.println(bk1.getAuthor());
//        System.out.println(bk1.getPrice());

//        System.out.println("\n");

//        bk.setSubject("Verbal Ability & Reading Comprehension");
//        bk.setAuthor("Nischit Sinha");
//        bk.setPublisher("Pearson");
//        bk.setDistributor("Mindworkz");
//        bk.setPrice(1299);

//        System.out.println(bk.getSubject());
//        System.out.println(bk.getAuthor());
//        System.out.println(bk.getPublisher());
//        System.out.println(bk.getDistributor());
//        System.out.println(bk.getPrice());

//        System.out.println("\n");

//        bk1.setSubject("Logical Reasoning");
//        bk1.setAuthor("Nischit Sinha");
//        bk1.setPrice(876);

//        System.out.println(bk1.getSubject());
//        System.out.println(bk1.getAuthor());
//        System.out.println(bk1.getPrice());
//        System.out.println("\n");

//        System.out.println(bk);
//        System.out.println(bk1);

//        bk1.copy(bk);

//        System.out.println(bk.getSubject());
//        System.out.println(bk.getAuthor());
//        System.out.println(bk.getPrice());
//        System.out.println("\n");

//        System.out.println(bk1.getSubject());
//        System.out.println(bk1.getAuthor());
//        System.out.println(bk1.getPrice());
//        System.out.println("\n");

//      INTERFACE: A TEMPLATE THAT CAN BE APPLIED TO A CLASS
//        INTERFACE IS SIMILAR TO INHERITANCE, BUT INTEFACES SPECIFY WHAT A CLASS HAS/MUST DOO,
//        CLASSES CAN APPLY MORE THAN ONE INTERFACE, INHERITANCE IS LIMITED TO ONE SUPERCLASS


//        car car = new car();

//        car.ride();

//        garage grg = new garage();
//        grg.service();


//        bike bk = new bike();

//        bk.ride();
//        bk.service();


//        POLYMORPHISM: the ability of an object to identify as more than one type

//        bike bk = new bike();
//        car car = new car();


//        System.out.println("\n");
//        garage bike;
//        garage[] j1 = {bk, car};

//        bk.service();
//        car.service();


//        for(garage x : j1){
//            x.service();
//        }

//          DYNAMIC POLYMORPHISM (RUNTIME POLYMORPHISM)

//        garage grg;


//        System.out.println("Enter your choice");
//        System.out.print("(1 : bike) or (2 : car)");
//        int choice = sc.nextInt();


//        if(choice == 1){
//            grg = new bike();
//            grg.service();
//        } else if (choice == 2) {
//            grg = new car();
//            grg.service();
//        }else {
//            grg = new garage();
//            grg.service();
//            System.out.println("! your choice is Invalid,... Enter the choice between 1 or 2");
//        }


//          EXCEPTION HANDLING IN JAVA: AN EVENT THAT OCCURS DURING THE NORMAL FLOW OF THE PROGRAM THAT DISRUPTS THE
//                NORMAL FLOW OF INSTRUCTIONS

//        System.out.print("Enter a divisor : ");
//        int a = sc.nextInt();
//        System.out.print("Enter a Dividend : ");
//        int b = sc.nextInt();
//
//        try {
//            int result = a / b;
//            System.out.println(result);
//        }catch(ArithmeticException e){
//            System.out.println("Cannot divide by zero");
//        }catch(InputMismatchException e){
//            System.out.println("Enter the input in the form of whole numbers!");
//        }
//        catch(Exception e){
//            System.out.println("You have entered an Exception, !" +
//                    " but it has been handled through exception handling methods");
//        }
//        finally{
//            sc.close();
//        }

//        FILE : AN ABSTRACT REPRESENTATION OF FILE AND DIRECTORY PATH-NAMES


//        File file = new File("java.txt");

//        if(file.exists()){
//            System.out.println("File Exists in the given path");
//        }else {
//            System.out.println("File does not exist in the provided path !!!");
//        }

//        System.out.println(file.isFile());
//        System.out.println(file.exists());
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.canRead());
//        System.out.println(file.canExecute());
//        System.out.println(file.canExecute());


//          FILE WRITER IN JAVA
//        try{
//            FileWriter fw = new FileWriter("jinx.txt");

//            fw.write("BE Mindful & Be playful \nLive Kindful and live Youngly ");
//            fw.append("\nbe Brave & trust the Process");
//            fw.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }

//        FILE-READER = READ THE CONTENTS OF THE FILE AS A STREAM OF CHARACTERS, ONE BY ONE..
//              READ() RETURNS A INT VALUE, WHICH CONTAINS THE BYTE VALUE
//              WHEN READ() RETURNS -1, THEN IS NO MORE DATA TO BE READ FROM THE FILE


//        try {
//            FileReader fr = new FileReader("java.txt");
//            int data = fr.read();
//            while(data != -1){
//                System.out.print((char)data);
//                data = fr.read();
//            }
//            fr.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//          JFrame : A GUI WINDOW TO ADD COMPONENTS TO






















    } // end of main method

}
