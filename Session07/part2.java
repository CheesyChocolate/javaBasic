import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
//        final int PER_LINE = 6;
//        int value, limit, mult, count = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a positive value: ");
//        value = scan.nextInt();
//        System.out.print("Enter an upper limit: ");
//        limit = scan.nextInt();
//        System.out.println("The multiples of " + value + " between "+value + " and " + limit + " are:");
//        for (mult = value; mult <= limit; mult += value) {
//            System.out.print(mult + "\t");
//            count++;
//            if (count % PER_LINE == 0)
//                System.out.println();
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println("Hold a number between 0 and 100 \n And I'm gonna guess it");
//        Scanner scan = new Scanner(System.in);
//        int low = 0;
//        int high = 100;
//        int guess = 50;
//        int count = 1;
//        boolean isGuessed = false;
//        while (!isGuessed) {
//            System.out.print ("My guess is: ");
//            System.out.println(guess);
//            System.out.println("Did I guess it?");
//            String answer = scan.nextLine();
//            if (answer.equalsIgnoreCase("yes")) {
//                System.out.println("Yay! I got you!");
//                isGuessed = true;
//            }
//            else {
//                System.out.print("Is it higher or lower than that? ");
//                if (answer.equalsIgnoreCase("higher")) {
//                    low = guess;
//                    guess = (low + high) / 2;
//                } else if (answer.equalsIgnoreCase("lower")) {
//                    high = guess;
//                    guess = (low + high) / 2;
//                }
//            }
//            count++;
//        }
//        if (count == 1) {
//            System.out.println("I guessed it in the first try! (っ▀¯▀)つ");
//        }
//        else {
//            System.out.println("I guessed it in " + count + " tries! ¯\\_(ツ)_/¯");
//        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int i = 0;
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num + "is not prime");
                break;
            }
            if (i == num) {
                System.out.println(num + "is prime");
                break;
            }
        }
    }
}
