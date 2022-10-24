/* made by suren */

/* a program that gets a csv files of student data and outputstwo csv
files. one has the avrage and letter of data in same order(Letter.csv)
added and the other one is soted(buy avrage value) varsion of first one

note: this version of program only supports Integer value not double,
due to better readability in csv files*/

package Session21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/* main class */
public class Project3   {

    /* main method */
    public static void main(String[] args) throws FileNotFoundException {
        File gradeFile = new File("Session21/Grades.csv");
        File letterFile = new File("Session21/Letter.csv");
        makeFile(analiizedStudentData(gradeFile), letterFile, "letterMod");
        File orderedFile = new File("Session21/Ordered.csv");
        makeFile(analiizedStudentData(gradeFile), orderedFile, "orderedMod");
    }

    /* reads a csv file and extract data as an array of studentData type */
    static ArrayList<studentData> analiizedStudentData(File gradesFiles) throws FileNotFoundException    {
        ArrayList<studentData> finalStudentDatas = new ArrayList<>();
        FileInputStream gradesFilesStream = new FileInputStream(gradesFiles);
        Scanner scanner = new Scanner(gradesFilesStream);
        for(int i=0; scanner.hasNextLine(); i++)    {
            String[] tokens = scanner.nextLine().split(";");
            studentData tmpStudentDatas = new studentData();
            tmpStudentDatas.indexed = tokens[0];
            tmpStudentDatas.stdudentNo = tokens[1];
            tmpStudentDatas.name = tokens[2];
            tmpStudentDatas.surename = tokens[3];
            tmpStudentDatas.studyClass = tokens[4];
            tmpStudentDatas.midtermScore = tokens[5];
            tmpStudentDatas.projectScore = tokens[6];
            tmpStudentDatas.finalScore = tokens[7];
            avrageLetter(tmpStudentDatas, i);
            finalStudentDatas.add(tmpStudentDatas);
        }
        scanner.close();
        return finalStudentDatas;
    }
    /* clculate avrage and letter of a student and put them in studentData */
    static void avrageLetter(studentData tmpStudentData, int i)    {
        if(i == 0)   {
           tmpStudentData.avrage = "Avrage";
           tmpStudentData.letter = "Letter";
        }
        else {
           int avarage = (Integer.parseInt(tmpStudentData.midtermScore)*3 + Integer.parseInt(tmpStudentData.projectScore)*3 + Integer.parseInt(tmpStudentData.finalScore)*4)/10;
           tmpStudentData.avrage = avarage + "";
           if (avarage >= 90)   tmpStudentData.letter = "AA";
           else if (avarage >= 85)  tmpStudentData.letter = "BA";
           else if (avarage >= 75)  tmpStudentData.letter = "BB";
           else if (avarage >= 70)  tmpStudentData.letter = "CB";
           else if (avarage >= 60)  tmpStudentData.letter = "CC";
           else if (avarage >= 55)  tmpStudentData.letter = "DC";
           else if (avarage >= 50)  tmpStudentData.letter = "DD";
           else                     tmpStudentData.letter = "FF";
        }
    }
    /** gets an array of data and output file and mod. then according to mod(if asked for "ordered"
    will sort the array) it will print data in output file */
    static void makeFile(ArrayList<studentData> dataArrayList, File outFile, String mod) throws FileNotFoundException {
        try {
            if (outFile.createNewFile()) {
                System.out.println("File " + outFile.getName() + " is created successfully.");
            }
            else {
                System.out.println("File " + outFile.getName() + " already exist in the directory.\nrename or transfer to prevent data loss");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
        if(mod.equals("orderedMod"))
            dataArrayList.sort((o1,o2) -> o2.avrage.compareTo(o1.avrage));
        PrintWriter outWriter = new PrintWriter(new FileOutputStream(outFile));
        for(studentData i:dataArrayList)
            outWriter.println(i.indexed + ";" + i.stdudentNo + ";" + i.name + ";" + i.surename + ";" + i.avrage + ";" + i.letter);
        outWriter.close();
    }
}
/* classes to store Data */
class studentData   {		//Note:		wondering why It's not possible to define a class before main class
    String indexed;
    String stdudentNo;
    String name;
    String surename;
    String studyClass;
    String midtermScore;
    String projectScore;
    String finalScore;
    String avrage;
    String letter;
}
