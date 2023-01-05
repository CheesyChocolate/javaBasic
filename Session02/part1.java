import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double var1;
        double var2;
        double var3;

        System.out.println("Enter the first one:");
        var1 = input.nextDouble();
        System.out.println("Enter the second one:");
        var2 = input.nextDouble();
        System.out.println("Enter the third one:");
        var3 = input.nextDouble();

        double avg = (var1 + var2 + var3)/3;

        System.out.println("The avg is: " + avg);
        input.close();
    }
}
