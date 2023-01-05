% methods and scope

1. write a program that will calculate the area of a circle, rectangle, or triangle
based on the user's choice. The program will ask the user to enter the
appropriate values for the shape they choose. The program will then display
the area of the shape.

The program will ask the user if they want to calculate another area. If the
user enters

```java
import java.util.Scanner;

public class circleCalc {
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
	    System.out.println("Enter 1 for circle, 2 for rectangle,
	    			or 3 for triangle");
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
```

---

2. write methods to calculate the devition and multiplication.
 you are not allowed to use the * and / operators.
 you are not allowed to use the Math library.

```java
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
```

---

3. now use these methods to calculate the power of a number.
you are not allowed to use the Math library.

```java
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
	System.out.println("The devition of " + a + " and " + b + " is: "
				+ devition(a, b));
	System.out.println("The multiplication of " + a + " and " + b + " is: "
				+ multiplication(a, b));
	System.out.println("The power of " + a + " and " + b + " is: "
				+ power(a, b));
	scanner.close();
}
```

---

4. you are a developer at riot games and you are tasked with creating the
   the new hp system for the game. the hp system has to be a class with
   the following methods:
  * healthinfo() - returns the current hp of the player
  * getHealed(int amount, int amplifier) - heals the player by the

  `amount*amplifier/100`

  * takeDamage(int amount, int Defense) - damages the player by the

  `amount*(100/(Defense+100))`

   _note:_ inform the user when campion has died

   _note:_ store current hp in main mthod and pass it to the class

```java
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
```

---

5. write a program that extracts the first digit of a number
   and prints it to the screen.  For example, if the user
   enters 1234, the program should print 1.  If the user
   enters 0, the program should print 0.  If the user enters
   -1234, the program should print 1.

   _note:_ write separate methods for negative and positive numbers

   _note:_ you need a method called getFirstDigit that takes a number
         and returns the first digit of that number. it may use each
         of the other methods(negative method and positive method).

```java
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
```

---

6. given a month number, return the name of the month

   @param monthNumber the number of the month

   @return the name of the month

```java
public class month_numberToName {
    public static String monthName(int monthNumber) {
	String monthName = "";
	switch (monthNumber) {
	    case 1:
		monthName = "January";
		break;
	    case 2:
		monthName = "February";
		break;
	    case 3:
		monthName = "March";
		break;
	    case 4:
		monthName = "April";
		break;
	    case 5:
		monthName = "May";
		break;
	    case 6:
		monthName = "June";
		break;
	    case 7:
		monthName = "July";
		break;
	    case 8:
		monthName = "August";
		break;
	    case 9:
		monthName = "September";
		break;
	    case 10:
		monthName = "October";
		break;
	    case 11:
		monthName = "November";
		break;
	    case 12:
		monthName = "December";
		break;
	    default:
		monthName = "Invalid month";
		break;
	}
	return monthName;
    }

    public static void main(String[] args) {
	System.out.println(monthName(6));
	System.out.println(monthName(10));
	System.out.println(monthName(13));
    }
}
```

---

7. simolate two diffrent dices and find the probability of getting a sum of n.
   dices have random sides from 2 to 12.
   * 'n' is read from the user.
   * formula for the probability is: P(A) = {Number of affair A} ⁄ {Total number of affair}


```java
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
		System.out.println("The probability of getting " + n + " is "
				+ count + "/" + (Dice1 * Dice2));
		scan.close();
	}
}
```
