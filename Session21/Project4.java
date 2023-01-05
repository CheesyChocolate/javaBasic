/* made by suren */

/* a program taht take a directory path and print a tree of sub directories.
also calculate and shows the sum size of directory contant */

/* note: the program is written for unix then ported for windows but not tasted.
the ability to rename turkish character is also is not tested.
the original program written for a build of Linux that has no support for
turkish character. */

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Project4 {

    /* main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the path of the directory: ");
        File inputFile = new File(scanner.nextLine());
        scanner.close();
        for (File fileLiString : getChildren(inputFile)) {
            System.out.println(fileLiString.getPath() + "\t\t" + getSize(fileLiString));
        }
    }

    /* arrayList of directory children  */
    static ArrayList<File> getChildren(File f) {
        Queue<File> q = new LinkedList<>();
        q.add(f);
        ArrayList<File> res = new ArrayList<>();
        while(!q.isEmpty()) {
            File cur = q.remove();
            standardRename(cur);
            if(cur.isDirectory())
                for(File ch: cur.listFiles())       //TODO      use Collections.addAll
                    q.add(ch);
            else
                res.add(cur);
        }
        System.out.println("");
        return res;
    }
    /* calculate the size of given directory */
    static String getSize(File f) {
        long res = 0;
        for(File i: getChildren(f))
            res += i.length();
        return res + " byte";
    }
    /* rename files to standard format(no small letter and no turkish letter) */
    static void standardRename(File f)   {
        String fileName = f.getName().toUpperCase();
        for(int i=0; i<fileName.length(); i++)          //TODO      unchecked: working OS doesn't support writting turkish character. adding turkish support future to OS breaks some functionallity of OS
            switch (fileName.charAt(i)) {
                case 'Ç':   fileName = fileName.replace('Ç', 'C');  break;
                case 'I':   fileName = fileName.replace('I', 'I');  break;
                case 'Ğ':   fileName = fileName.replace('Ğ', 'G');  break;
                case 'Ü':   fileName = fileName.replace('Ü', 'U');  break;
                case 'Ö':   fileName = fileName.replace('Ö', 'O');  break;
                case 'Ş':   fileName = fileName.replace('Ş', 'S');  break;
                default:                                            break;
            }
        if(f.renameTo(new File (f.getParent() + "\\" + fileName)))      //TODO      this renameing function makes the program, OS dependent
            System.out.print(".");
        else
            System.out.print("error");
    }
}
