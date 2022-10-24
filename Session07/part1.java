package Session7;

import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
//        int hold = (int)(Math.random()*100);
//        int g = -1;
//        Scanner sc = new Scanner(System.in);
//        while (hold != g) {
//            System.out.println("Guess the number: ");
//            g = sc.nextInt();
//            if (g == hold) {
//                System.out.println("You guessed it!");
//            }
//            else if (g > hold) {
//                System.out.println("Too high!");
//            }
//            else {
//                System.out.println("Too low!");
//            }
//        }
////////////////////////////////////////////////////////////
//        int number, lastDigit, reverse = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        number = sc.nextInt();
//        do {
//            lastDigit = number % 10;
//            System.out.println(lastDigit);
//            reverse = reverse * 10 + lastDigit;
//            number = number / 10;
//        } while (number != 0);
//        System.out.println("Reverse of the number is: " + reverse);
////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int space = number;
        for (int i = 1; i <= number; i++) {
            for (int k = space - 1; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            space--;
            System.out.println();
        }

        sc.close();
    }
}
