package Session1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.print("enter the Num 1: ");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.print("Enter Num 2: ");
        double num2 = input.nextDouble();
        input.close();
        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        double multi = num2 * num1;
        System.out.println("The multiplication is: " + multi);
        double div = num1/num2;
        System.out.println("The division is: " + div);
        double sub = num1 - num2;
        System.out.println("The subtraction is: " + sub);

    }
}
