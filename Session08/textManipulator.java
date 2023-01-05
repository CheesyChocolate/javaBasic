/** write a program that extracts the first digit of a number
  * and prints it to the screen.  For example, if the user
  * enters 1234, the program should print 1.  If the user
  * enters 0, the program should print 0.  If the user enters
  * -1234, the program should print 1.
  * note: write separate methods for negative and positive numbers
  * note: you need a method called getFirstDigit that takes a number
  *       and returns the first digit of that number. it may use each
  *       of the other methods(negative method and positive method).
 */

import java.util.Scanner;

public class textManipulator {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	System.out.println("The first digit is: " + getFirstDigit(number));
    }

    public static int getFirstDigit(int number) {
	if (number < 0) {
	    return getFirstDigitNegative(number);
	} else {
	    return getFirstDigitPositive(number);
	}
    }

    public static int getFirstDigitNegative(int number) {
	number = number * -1;
	return getFirstDigitPositive(number);
    }

    public static int getFirstDigitPositive(int number) {
	while (number >= 10) {
	    number = number / 10;
	}
	return number;
    }
}
