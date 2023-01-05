import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter the 2 digits number: ");
        x = input.nextInt();
        int x1 = x%10;
        int x2 = (x-x1)/10;

        System.out.println("First digit is: " + x2 + "\n" + "Second digit is: " + x1);

        input.close();
    }
}
