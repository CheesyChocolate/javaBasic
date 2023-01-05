import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 6. Write a program which takes the absolute path of a directory and computes the
total size of the directory (including all its subdirectories) using recursion.
Methods of File class will be helpful.
7. Write the same program but instead of recursion, use a queue.
8. Write a program which reports all files in a given directory whose size is greater
than a threshold value. */

public class Lab {

    /* main method */
    public static void main(String[] args) {
        //empty
    }

    /* Inspect the questions 7 and 8 in the tutorial
    document and see that most of their code is almost
    identical. As a good programmer, you should consider
    revising them to reduce the redundancy. Come up
    with a cure and fix the problem. */
    static ArrayList<File> getChildren(File f) {
        Queue<File> q = new LinkedList<>();
        q.add(f);
        ArrayList<File> res = new ArrayList<>();
        while(!q.isEmpty()) {
            File cur = q.remove();
            if(cur.isDirectory())
                for(File ch: cur.listFiles())
                    q.add(ch);
            else
                res.add(cur);
        }
        return res;
    }
    static long getSize(File f) {
        long res = 0;
        for(File i: getChildren(f))
            res += i.length();
        return res;
    }
    static void reportBigs(File f, long sizeLimit) {
        int pathLen = f.getAbsolutePath().length();
        for(File i: getChildren(f))
            if(i.length() > sizeLimit)
                System.out.println(i.getAbsolutePath().substring(pathLen));
    }

    /* Modify the 8th question in the tutorial document so
    that the program also takes into account the last
    modified time of files. Your program should filter for
    both big and old (unused for a long time) files. You
    can use the lastModified() method of File class. */
    static void reportOldBigs(File f, long sizeLimit, long timeLimit) {
        int pathLen = f.getAbsolutePath().length();
        for(File i: getChildren(f))
            if(i.length() > sizeLimit && i.lastModified() < timeLimit)
                System.out.println(i.getAbsolutePath().substring(pathLen));
    }

    /* On the next slide you will find code for a simple
    contacts app, read it first. There is an essential
    feature missing, all the data is lost as soon as you halt
    the program. Fix this problem by adding the
    save/load feature. */
    public static void contactss() throws Exception  {
        try (Scanner in = new Scanner(System.in)) {
            HashMap<String, String> contacts = new HashMap<>();
            boolean exitProgram = true;
            while(exitProgram) {
                // Menu
                System.out.println("1. Add contact\n2. Delete contact\n3. Show contacts\n4. Save\n5. Load");
                    // options
                switch(in.nextInt()) {
                    case 1:
                        contacts.put(in.next(), in.next()); // name --> number
                        break;
                    case 2:
                        contacts.remove(in.next());
                        break;
                    case 3:
                        show(contacts);
                        break;
                    case 4:
                        save(contacts);
                        break;
                    case 5:
                        contacts = load();
                        break;
                    default:
                        exitProgram = false;
                        break;
                }
            }
        }
    }
    static void save(HashMap<String, String> contacts) throws Exception {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("contacts.dat"))) {
            out.writeObject(contacts);
        }
    }
    static HashMap<String, String> load() throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("contacts.dat"))) {
            return (HashMap<String, String>) in.readObject();
        }
    }
    static void show(HashMap<String, String> contacts) {
        System.out.println();
        for(String name: contacts.keySet())
            System.out.println(name + " --> " + contacts.get(name));
        System.out.println();
    }
}
