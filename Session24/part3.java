import java.util.*;

public class main {

	public static double f(double a) {
		System.out.println(a + " sended");
		a = 10;
		System.out.println("The value of the sent parameter is set to " + a );
		return a;
		}

	public static void main(String[] args) {
		double a = 5;
		double b = f(a);
		System.out.println("a --> " + a );
		System.out.println("b --. " + b);
		a = f(a);
		System.out.println("a --> " + a );
	}
}
