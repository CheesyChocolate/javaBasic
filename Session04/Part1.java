package Session4;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
//        double w = scanner.nextDouble();
//        double h = scanner.nextDouble();
//        double bmi = w / (h * h);
//        if (bmi < 18.5) {
//            System.out.println("Underweight");
//        }
//        else if (bmi >= 18.5 && bmi < 25) {
//            System.out.println("Normal");
//        }
//        else if (bmi >= 25 && bmi < 30) {
//            System.out.println("Overweight");
//        }
//        else if (bmi >= 30) {
//            System.out.println("Obese");
//        }
        ///////////////////////////////////////////////////////////////////////
        System.out.println("Enter your Sex: ");
        char s = scanner.next().charAt(0);
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        if ((s == 'M' && age >= 65) || (s == 'F' && age >= 60) ){
            System.out.println("You can Retired");
        }else {
            System.out.println("You can't Retired");
        }
//        if (s == 'M')
//            if (age >= 65) {
//                System.out.println("You can Retired");
//            } else {
//                System.out.println("You can't Retired");
//            }
//        else if (s == 'F') {
//            if (age >= 60) {
//                System.out.println("You can Retired");
//            }
//            else {
//                System.out.println("You can't Retired");
//            }
//        }
        ///////////////////////////////////////////////////////////////////////
        scanner.close();
    }
}
