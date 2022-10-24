package Session9;

//import java.util.Scanner;

public class part1 {
    public static int max(int num1, int num2, int num3) {
        int result = 0;
        if (num1 >= num2 && num1 >= num3) {
            result = num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            result = num2;
        }
        else {
            result = num3;
        }
        return result;
    }
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
    public static boolean isPrime(int num) {
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int i = 5;
        int j = 2;
        int p = 3;
        int k = max(i, j, p);
        System.out.println("The max of " + i + " and " + j + " and " + p + " is " + k);

        int m = 5;
        boolean isP = isPrime(m);
        System.out.println("Is " + m + " prime? " + isP);
    }
}
