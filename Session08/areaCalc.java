/** write a program that will calculate the area of a circle, rectangle, or triangle
 *  based on the user's choice. The program will ask the user to enter the
 *  appropriate values for the shape they choose. The program will then display
 *  the area of the shape.
 *  The program will ask the user if they want to calculate another area. If the
 *  user enters */

import java.util.Scanner;

public class areaCalc {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	// can i declare these varibles inside if blocks, if there's no do-while loop?
	int choice;
	double area = 0;
	double radius;
	double length;
	double width;
	double base;
	double height;
	boolean answer;

	do {
	    System.out.println("Enter 1 for circle, 2 for rectangle, or 3 for triangle");
	    choice = scanner.nextInt();

	    if (choice == 1) {
		System.out.println("Enter the radius of the circle");
		radius = scanner.nextDouble();
		area = Math.PI * Math.pow(radius, 2);
	    } else if (choice == 2) {
		System.out.println("Enter the length of the rectangle");
		length = scanner.nextDouble();
		System.out.println("Enter the width of the rectangle");
		width = scanner.nextDouble();
		area = length * width;
	    } else if (choice == 3) {
		System.out.println("Enter the base of the triangle");
		base = scanner.nextDouble();
		System.out.println("Enter the height of the triangle");
		height = scanner.nextDouble();
		area = (base * height) / 2;
	    } else {
		System.out.println("Invalid choice");
	    }

	    System.out.println("The area is " + area);
	    System.out.println("Do you want to calculate another area? (true/false)");
	    answer = scanner.nextBoolean();
	} while (answer);

	System.out.println("Goodbye");
	scanner.close();
    }
}
