import java.util.*;

public class part1 {
	public static void main(String[] args) {
		Game game = new Game();
		game.generateRandomNumber();
		Scanner girdi = new Scanner(System.in);
		System.out.print("Guess number: ");
		int number = girdi.nextInt();
		char status = '<';
		while (status!='=')
		{
			status = game.compareNumbers(number);
			game.compareResults(status, number);
			if (status!='=')
			{
				System.out.print("Guess number:");
				number = girdi.nextInt();
			}
		}
		girdi.close();
	}
}

class Game {

	int number;

	Game()
	{
		number = 0;
	}

	int returnRandNumber()
	{
		return this.number;
		// return number;
	}

	void generateRandomNumber()
	{
		Random rand = new Random();
		int r = rand.nextInt(100)+1;
		this.number = r;
	}

	char compareNumbers(int sayi)
	{
		if (sayi==this.number)
			return '=';
		else if(sayi>this.number)
			return '>';
		else
			return '<';
	}

	void compareResults(char status, int sayi)
	{
	if (status=='=')
		System.out.println("Correct!: "+sayi);
	else if (status=='>')
		System.out.println("Incorrect. Guess smaller number");
	else if (status=='<')
		System.out.println("Incorrect. Guess bigger number");
	else
		System.out.println("Error!");
	}
}
