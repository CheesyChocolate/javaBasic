import java.util.*;

public class part2 {

	public static int klavyedenOku()
	{
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

	public static int kombinasyon(int par1, int par2) {

		return faktoriyel(par1)/(faktoriyel(par2)*faktoriyel(par1-par2));
	}

	public static void main(String[] args) {

		System.out.print ("enter a: "); int a = klavyedenOku();
		System.out.print ("enter b: "); int b = klavyedenOku();

		int komb = kombinasyon(a,b);

		System.out.println ("Kombinasyon " +komb );

	}

}
