import java.util.*;

public class main {

	public static int RoundInt(double d) {
		int a=(int) d;

		if (d-a > 0.5)
			a++;

		return a;
		}

	public static int RoundInt2(double d) {
		return (int) (d + 0.5);
	}


	public static void main(String[] args) {
		double a = 4.7;
		System.out.println("RoundInt: " + RoundInt(a));
		System.out.println("RoundInt2: " + RoundInt2(a));
	}

}
