import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("enter somthing: ");
        String tmp = scr.nextLine();
        System.out.println("The name is: " + tmp);
        scr.close();
    }
}