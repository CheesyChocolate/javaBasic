/* a simple password checker */
/* this program has a password in it, and it checks to see if the user
   has entered the correct password.  If the user has entered the correct
   password, the program will print out "Access Granted".  If the user
   has entered the wrong password, the program will print out "Access
   Denied, try again".  The program will continue to ask the user for a
   password until the user enters the correct password.  The program will
   then print out "Access Granted" and exit. if the user enter the wrong
   password three times. the program will print out "failed to authenticate" */

import java.util.Scanner;

public class part3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int password = 12345678;
		int userPassword;
		int count = 0;
		do {
			System.out.print("Enter password: ");
			userPassword = input.nextInt();
			input.nextLine();
			if (userPassword == password) {
				System.out.println("Access Granted");
				break;
			}
			else {
				System.out.println("Access Denied, try again");
			}
			if (count == 2) {
				System.out.println("failed to authenticate");
				break;
			}
			count++;
		} while (!(userPassword == password));
		input.close();
	}
}
