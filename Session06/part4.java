/* write a program that reads integer 'n', and then returns
   the n'th row of Pascal's triangle. without using recursive function*/
import java.util.Scanner;

public class part1 {
	// Print the N-th row of the
	// Pascal's Triangle
	static void generateNthrow(int N) {
		int prev = 1;
		System.out.print(prev);

		for(int i = 1; i <= N; i++) {
			int curr = (prev * (N - i + 1)) / i;
			System.out.print(", " + curr);
			prev = curr;
		}
	}
	public static void main (String[] args)	{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		generateNthrow(N);
	}
}
