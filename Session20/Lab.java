import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab {

    /* main mathod */
    public static void main(String[] args) {
        //empty
    }

    /* Write a function which takes an array of File objects
    and returns their total size in kilobytes. */
    static double totalSize(File[] files) {
        // your code
        double sum = 0;
        for(File f: files)
            sum += f.length()/1024.0;
        return sum;
    }

    /* Write a function which takes two File objects, and
    appends the content of the second file at the end of
    the first file (parameter order). Then the second file
    should be deleted. */
    static void merge(File f1, File f2) throws Exception {
        Scanner sc = new Scanner(f2);
        PrintWriter out = new PrintWriter(new FileOutputStream(f1, true));
        while(sc.hasNextLine())
            out.println(sc.nextLine());
        // release resources
        out.close();
        sc.close();
        // delete f2
        f2.delete();
        sc.close();
    }

    /* Consider a structured text file where each row
    consists of two fields: Name and Age, separated by a
    tab (\t) character. Write a function which searches for
    a specific name and returns the corresponding age. If
    no such name appears in the file it should return -1. */
    static int getAge(File f, String name) throws Exception {
        //your code
        if(!f.canRead())
            return -1;
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split("\t");
            if(tokens[0].equals(name))
                return Integer.valueOf(tokens[1]);
        }
        sc.close();
        return -1;
    }

    /* Write a file-displayer program which asks user to
    enter a file name and displays the contents of the file
    to the screen line-by-line if such a file exists. Else,
    your program should inform the user that the file
    does not exist and asks another file name. */
    public static void jCat() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a file name: ");
        File f = new File(sc.next());
        while(!f.exists()) {
            System.out.print("File not found, please enter a valid name: ");
            f = new File(sc.next());
        }
        sc = new Scanner(f);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
        sc.close();
    }
}
