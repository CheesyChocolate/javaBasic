/** write methods to calculate the devition and multiplication.
  * you are not allowed to use the * and / operators.
  * you are not allowed to use the Math library. */

import java.util.Scanner;

public class theCalc {

	public static int devition(int a, int b) {
		int result = 0;
		while (a >= b) {
			a = a - b;
			result++;
		}
		return result;
	}

	public static int multiplication(int a, int b) {
		int result = 0;
		for (int i = 0; i < b; i++) {
			result = result + a;
		}
		return result;
	}


/** now use these methods to calculate the power of a number.
  * you are not allowed to use the Math library. */

	public static int power(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result = multiplication(result, a);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int b = scanner.nextInt();
		System.out.println("The devition of " + a + " and " + b + " is: " + devition(a, b));
		System.out.println("The multiplication of " + a + " and " + b + " is: " + multiplication(a, b));
		System.out.println("The power of " + a + " and " + b + " is: " + power(a, b));
		scanner.close();
	}
}
