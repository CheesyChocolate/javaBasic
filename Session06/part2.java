import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int count = 1;
//        int sum = 0;
//        while (count <= 10) {
//            System.out.print("Enter number " + count + ": ");
//            int num = sc.nextInt();
//            sum = sum + num;
//            count++;
//        }
//        System.out.println("Sum = " + sum);
///////////////////////////////////////////////////
//        int sum = 0, value = -1;
//        double avg = 0;
//        while (value != 0) {
//            System.out.print("Enter a number(0 to quit): ");
//            value = sc.nextInt();
//            sum =+ value;
//            avg = (double)sum / 2;
//        }
//        System.out.println("Sum = " + sum);
//        System.out.println("Average = " + avg);
///////////////////////////////////////////////////
//        final int NUM_GAMES = 12;
//        int won;
//        double ratio;
//        System.out.print("Enter the number of games won (0 to " + NUM_GAMES + "): ");
//        won = sc.nextInt();
//        while (won < 0 || won > NUM_GAMES) {
//            System.out.print("Invalid input. Please reenter: ");
//            won = sc.nextInt();
//        }
//        ratio = (double) won / NUM_GAMES;
//        System.out.println("\nWinning percentage:\t" + (ratio*100) + "%");
///////////////////////////////////////////////////
        String text, cntnu = "y";
        int left, right;
        while (cntnu.equalsIgnoreCase("y")){
            System.out.print("Enter a String: ");
            text = sc.nextLine();
            left = 0;
            right = text.length() - 1;
            while (
                    text.charAt(left) == text.charAt(right)
                    && left < right
            ) {
                left++;
                right--;
            }
            if (left < right) {
                System.out.println(" NOT a palindrome.");
            }
            else{
                System.out.println("That string IS a palindrome.");
            }
            System.out.print("\nTest another palindrome (y/n)? ");
            cntnu = sc.nextLine();
        }
        sc.close();
    }
}
