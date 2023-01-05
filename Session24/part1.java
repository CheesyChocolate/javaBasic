import java.util.*;

public class part1 {

	public static int klavyedenOku()
	{
		System.out.print ("enter the number to be calculated ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();

		return number;
	}

	public static int faktoriyel(int number)
	{
		int faktoriyel=1;

		for (int i = 1; i<=number; i++)
			faktoriyel=faktoriyel*i;

		return faktoriyel;
	}

	public static void main(String[] args) {
		int n = klavyedenOku();
		int f = faktoriyel(n);

		System.out.println (n + "!=" +f);
	}

}
