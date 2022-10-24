package Session1;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        System.out.println("Input The Radius:");
        Scanner input = new Scanner(System.in);
        double a;
        double r = input.nextDouble();
        a = r * r * 3.14;
        System.out.println("The area for the circle of radius " + r + " is " + a);
        System.out.println("Enter next one:");
        double r2 = input.nextDouble();
        a = r2 * r2 * 3.14;
        System.out.println("The area for the circle of radius " + r2 + " is " + a);
        input.close();
    }
}
