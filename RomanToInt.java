public class RomanToInt {
// Convert Roman to Integer
    public static void main(String[] args)
    {
        String s = "III";
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);
            switch (c) {
                case 'I':
                    sum += 1;
                    break;

                case 'V':
                    sum += 5;
                    break;

                case 'X':
                    sum += 10;
                    break;

                case 'L':
                    sum += 50;
                    break;

                case 'C':
                    sum += 100;
                    break;

                case 'D':
                    sum += 500;
                    break;

                case 'M':
                    sum += 1000;
                    break;

                default:
                    System.err.println("Invalid Roman Number");
            }
        }

        if(s.contains("IV") || s.contains("IX")) sum-=2;
        if(s.contains("XL") || s.contains("XC")) sum-=20;
        if(s.contains("CD") || s.contains("CM")) sum-=200;
        System.out.println("Roman to Integer value is " + sum);

    }
}
