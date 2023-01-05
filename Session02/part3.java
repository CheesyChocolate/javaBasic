import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds;
        System.out.println("Enter the seconds: ");
        seconds = input.nextInt();
        int h = seconds/(3600);
//        int m = (seconds - (h*3600)) / 60;
        int m = (seconds%3600)/60;
        int s = seconds%60;
        System.out.println(h + " hours " + m + " minutes " + s + " Seconds");

        input.close();
    }
}
