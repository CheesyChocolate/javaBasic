/** a dice game between a player and a computer
  * each round the player and computer roll a two dice
  * point for each round is the sum of the two dice
  * if the player or computer rolls a double, he gets 2 extra points
  * the player who reaches or exceeds 100 points first wins
  * information for each round should be printed to the screen in the following format:
  * 3rd round played
  * player rolled 3 and 4
  * computer rolled 1 and 2
  * player totla points: 7
  * computer total points: 3
  * at the end of the game, the winner should be printed to the screen
  * if the game ends in a tie, print "The game end in a draw at the end of the 10th round"
  */

import java.util.Random;
import java.util.Scanner;

//TODO: wtf is this mess
public class PlayerVsComputer_DiceGame {
	public static void main(String[] Args) {
		TwoDices player = new TwoDices();
		player.setPlayerType("player");
		TwoDices computer = new TwoDices();
		computer.setPlayerType("computer");
		int round = 1;
		while(player.getTotalPoints() < 100 && computer.getTotalPoints() < 100) {
			player.roll();
			computer.roll();
			System.out.println(round + "th round played");
			System.out.println(player.toString());
			System.out.println(computer.toString());
			System.out.println("player total points: " + player.getTotalPoints());
			System.out.println("computer total points: " + computer.getTotalPoints());
			System.out.println();
			round++;
		}
		if(player.getTotalPoints() > computer.getTotalPoints()) {
			System.out.println("player wins");
		} else if(player.getTotalPoints() < computer.getTotalPoints()) {
			System.out.println("computer wins");
		} else {
			System.out.println("The game end in a draw at the end of the" + round + "th round");
		}
	}
}

class TwoDices {
	int dice1;
	int dice2;
	int totalPoints;
	String playerType;

	public TwoDices() {
		this.dice1 = 0;
		this.dice2 = 0;
		this.totalPoints = 0;
		this.playerType = "";
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public void roll() {
		if (this.playerType == "player") {
			Scanner input = new Scanner(System.in);
			System.out.print("Press enter to roll the dice");
			input.nextLine();
		}
		Random random = new Random();
		this.dice1 = random.nextInt(6) + 1;
		this.dice2 = random.nextInt(6) + 1;
	}

	public String toString() {
		return this.playerType + " rolled " + this.dice1 + " and " + this.dice2;
	}

	// TODO: calculation is wrong, yeah this method is garbage
	public int getTotalPoints() {
		this.totalPoints += this.dice1 + this.dice2;
		if(this.dice1 == this.dice2) {
			this.totalPoints += 2;
		}
		return this.totalPoints;
	}

	public boolean isDouble() {
		return this.dice1 == this.dice2;
	}
}
