package Session3;

//import java.util.Random;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
//        final int MINOR = 21;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scan.nextInt();
//        System.out.println("You entered: " + age);
//        if (age < MINOR) {
//            System.out.println("Youth is a wonderful thing. Enjoy.");
//        }
//        System.out.println("Age is a state of mind.");

//////////////////////////////////////////////////////////////////////////////////

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int x = scan.nextInt();
//        if (x % 2 == 0) {
//            System.out.println("HiEven");
//        }
//        if (x % 5
//                == 0) {
//            System.out.println("HiFive");
//        }

//////////////////////////////////////////////////////////////////////////////////
//        final int MAX = 10;
//        int answer, guess;
//        Scanner scan = new Scanner(System.in);
//        Random generator = new Random();
//        answer = generator.nextInt(MAX) + 1;
//        System.out.print("I'm thinking of a number between 1 and "
//                + MAX + ". Guess what it is: ");
//        guess = scan.nextInt();
//        if (guess == answer)
//            System.out.println("You got it! Good guessing!");
//        else
//        {
//            System.out.println("That is not correct, sorry.");
//            System.out.println("The number was " + answer);
//        }
//
//////////////////////////////////////////////////////////////////////////////////
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = scan.nextInt();
        if (grade >= 90) {
            System.out.println("Fantastic! You've got A");
        }
        else if (grade >= 80) {
            System.out.println(" Good job! You've got B");
        }
        else if (grade >= 70) {
            System.out.println(" Not bad! You've got C");
        }
        else if (grade >= 60) {
            System.out.println("Nice try! You've got D");
        }
        else {
            System.out.println("Try again! You've got F");
        }
        scan.close();
    }
}
