/** you are a developer at riot games and you are tasked with creating the
  * the new hp system for the game. the hp system has to be a class with
  * the following methods:
  * healthinfo() - returns the current hp of the player
  * getHealed(int amount, int amplifier) - heals the player by the amount*amplifier/100
  * takeDamage(int amount, int Defense) - damages the player by the amount*(100/(Defense+100))
  * note: inform the user when campion has died
  * note: store current hp in main mthod and pass it to the class
  */

import java.util.Scanner;

public class HpSystem {
	public static void healthinfo(int hp) {
		System.out.println("Your current hp is " + hp);
	}
	public static int getHealed(int amount, int amplifier) {
		int Healed = amount*amplifier/100;
		System.out.println("You have been healed by " + Healed + " hp");
		return Healed;
	}
	public static int takeDamage(int amount, int Defense) {
		int Damaged = amount*(100/(Defense+100));
		System.out.println("You have been damaged by " + Damaged + " hp");
		return Damaged;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your max hp: ");
		int maxhp = scanner.nextInt();
		int hp = maxhp;
		for(boolean quit=false; quit==false;) {

			System.out.println("Enter 1 to get your current hp");
			System.out.println("Enter 2 to get healed");
			System.out.println("Enter 3 to take damage");
			System.out.println("Enter 4 to quit");
			int choice = scanner.nextInt();
			if (choice == 1) {
				healthinfo(hp);
			}
			else if (choice == 2) {
				System.out.println("Enter the amount you want to be healed by");
				int amount = scanner.nextInt();
				System.out.println("Enter the amplifier");
				int amplifier = scanner.nextInt();
				hp += getHealed(amount, amplifier);
			}
			else if (choice == 3) {
				System.out.println("Enter the amount you want to be damaged by");
				int amount = scanner.nextInt();
				System.out.println("Enter the Defense");
				int Defense = scanner.nextInt();
				hp -= takeDamage(amount, Defense);
			}
			else if (choice == 4) {
				quit = true;
			}
			else {
				System.out.println("Invalid input");
			}
			if (hp <= 0) {
				System.out.println("You have died");
				quit = true;
			}
		}
		scanner.close();
	}
}
