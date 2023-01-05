/* write a program that reads a positive integer 'n' and prints all the distinct
   devisors of 'n'. */
/* the simple solouton is to check all the numbers from 1 to n and print the
  numbers that are devisors of n.
  a better solouton is as follows:
  1. write a for loop from 1 to '√n' that steps by 1.
  2. check if 'n' is devisoble by current itration
  3. 'n' and 'n/i' are the numbers we looking for
  note. 'n' and 'n/2' can be equal, un this case print one of them.*/
/* make a seperate method for function and scanner. */

import java.util.Scanner;
public class part2 {
	static void Devisors(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				if (n / i != i) {
					System.out.print(n / i + " ");
				}
			}
		}
	}
	static int scanThis() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		return n;
	}
	public static void main(String[] args) {
		int n = 100;
		Devisors(n);
	}
}
