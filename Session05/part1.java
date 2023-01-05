import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a text value: ");
//        String s = sc.nextLine();
//        System.out.println("Read value: " + s);
//        System.out.println("lenght " + s.length());
//        System.out.println("uppercase: " + s.toUpperCase());
//        System.out.println("Lowercase " + s.toLowerCase());
///////////////////////////////////////////////////////////////////////////////////

//        String c = sc.next();
//        // hex to binary
//        String binary = "";
//        String binary2 = "";
//        int d1 = 0;
//        int d2 = 0;
//        switch (c.charAt(0)) {
//            case 'A':
//                binary = "1010";
//                d1 = 10;
//                break;
//            case 'B':
//                binary = "1011";
//                d1 = 11;
//                break;
//            case 'C':
//                binary = "1100";
//                d1 = 12;
//                break;
//            case 'D':
//                binary = "1101";
//                d1 = 13;
//                break;
//            case 'E':
//                binary = "1110";
//                d1 = 14;
//                break;
//            case 'F':
//                binary = "1111";
//                d1 = 15;
//                break;
//            case '0':
//                binary = "0000";
//                d1 = 0;
//                break;
//            case '1':
//                binary = "0001";
//                d1 = 1;
//                break;
//            case '2':
//                binary = "0010";
//                d1 = 2;
//                break;
//            case '3':
//                binary = "0011";
//                d1 = 3;
//                break;
//            case '4':
//                binary =  "0100";
//                d1 = 4;
//                break;
//            case '5':
//                binary = "0101";
//                d1 = 5;
//                break;
//            case '6':
//                binary =  "0110";
//                d1 = 6;
//                break;
//            case '7':
//                binary = "0111";
//                d1 = 7;
//                break;
//            case '8':
//                binary =  "1000";
//                d1 = 8;
//                break;
//            case '9':
//                binary = "1001";
//                d1 = 9;
//                break;
//        }
//        switch (c.charAt(1)) {
//            case 'A':
//                binary2 = "1010";
//                d2 = 10;
//                break;
//            case 'B':
//                binary2 = "1011";
//                d2 = 11;
//                break;
//            case 'C':
//                binary2 = "1100";
//                d2 = 12;
//                break;
//            case 'D':
//                binary2 = "1101";
//                d2 = 13;
//                break;
//            case 'E':
//                binary2 = "1110";
//                d2 = 14;
//                break;
//            case 'F':
//                binary2 = "1111";
//                d2 = 15;
//                break;
//            case '0':
//                binary2 = "0000";
//                d2 = 0;
//                break;
//            case '1':
//                binary2 = "0001";
//                d2 = 1;
//                break;
//            case '2':
//                binary2 = "0010";
//                d2 = 2;
//                break;
//            case '3':
//                binary2 = "0011";
//                d2 = 3;
//                break;
//            case '4':
//                binary2 =  "0100";
//                d2 = 4;
//                break;
//            case '5':
//                binary2 = "0101";
//                d2 = 5;
//                break;
//            case '6':
//                binary2 =  "0110";
//                d2 = 6;
//                break;
//            case '7':
//                binary2 = "0111";
//                d2 = 7;
//                break;
//            case '8':
//                binary2 =  "1000";
//                d2 = 8;
//                break;
//            case '9':
//                binary2 = "1001";
//                d2 = 9;
//                break;
//        }
//        int decimal = (d1 * 16) + d2;
//        System.out.println("Binary Value is: " + binary + binary2);
//        System.out.println("Decimal Value is: " + decimal);
        ////////////////////////////////////////////////////////////////////////////////////////////

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a city: ");
       String city1 = sc.nextLine();
       System.out.print("Enter another city: ");
       String city2 = sc.nextLine();
       if (city1.compareTo(city2) < 0) {
           System.out.println("The cities in alphabetical order are " +
                   city1 + ", " + city2);
       }
       else {
           System.out.println("The cities in alphabetical order are " +
                   city2 + ", " + city1);
           }
       if (city1.equals(city2)) {
           System.out.println("The cities are the same");
       }
       if (city1.equalsIgnoreCase(city2)) {
           System.out.println("The cities are the same, but in different case");
       }
       sc.close();
    }
}
