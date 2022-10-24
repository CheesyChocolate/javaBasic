package Session1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
       Scanner ObjUsername = new Scanner(System.in);
       String UserName = ObjUsername.nextLine();
       System.out.println("The name is: " + UserName);
       ObjUsername.close();
    }
}