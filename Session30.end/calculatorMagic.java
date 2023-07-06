/** Design a Calculator class. You can define the variables you want to use, of any type and
  * access level. Just write the Default Constructor. Define and code only one function in the
  * class, which should take two integers and operation parameters from the user, and print the
  * result on the screen according to the operation type.
  */

import java.util.Scanner;

public class calculatorMagic {
    public static void main(String[] args) {
	Calculator calc = new Calculator();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	System.out.println("Enter the operation you want to perform: ");
	String operation = input.next();
	calc.calculate(num1, num2, operation);
    }
}

// Path: Calculator.java
class Calculator {
	int num1, num2;
	char operation;

	public Calculator() {
		num1 = 0;
		num2 = 0;
		operation = ' ';
	}

	public void calculate(int num1, int num2, String operation) {
		switch (operation) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("Invalid operation");
		}
	}
}
