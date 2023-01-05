/** simolate two diffrent dices and find the probability of getting a sum of n.
  * dices have random sides from 2 to 12.
  * 'n' is read from the user.
  * formula for the probability is: P(A) = {Number of affair A} ⁄ {Total number of affair}
 */

import java.util.Random;
import java.util.Scanner;

public class Dices {
	public static int probability(int Dice1, int Dice2, int n) {
		int count = 0;
		for (int i = 0; i < Dice1; i++) {
			for (int j = 0; j < Dice2; j++) {
				if (i + j == n) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int Dice1 = rand.nextInt(11) + 2;
		int Dice2 = rand.nextInt(11) + 2;
		System.out.println("Dice1 has " + Dice1 + " sides");
		System.out.println("Dice2 has " + Dice2 + " sides");
		System.out.println("Enter a number between 2 to " + (Dice1 + Dice2));
		int n = scan.nextInt();
		int count = probability(Dice1, Dice2, n);
		System.out.println("The probability of getting " + n + " is " + count + "/" + (Dice1 * Dice2));
		scan.close();
	}
}
