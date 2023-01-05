import java.util.Scanner;

public class part2 {
    public static float factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static int sum(int n) {
        if (n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(factorial(n));
//        System.out.println(sum(n));
        System.out.println(fibonacci(n));

        sc.close();
    }
}
