import java.util.Scanner;

/** 1. It is desired to keep the midterm, project and final grades of a 30-person class in a
2-dimensional array. Write the readGrades() method, which reads this class's notes from the
keyboard (The method will return the array)

* 2. Write a method that calculates the grade values of the class and returns it as a one-
dimensional array at the end of the method.
public void char[] calculateGrades(int[][] grades)
(Not: Biruni Üniversitesi Not sistemini göz önüne alırak finalin %60 ı ve ara sınavın %40 ı
alındığına ve projelerin ara sınava %40 etkilediğine dikkat ediniz.)

* 3. Write down mean method mean(int[][] grades, int i). (If i=1 midterm exam, if i=2 project
average, and if i=3 final average will be calculated, otherwise -1 value will be returned)

  4. Write the code that will return the result by calculating the standard deviation of any exam
type (midterm, project or final) between the grades entered.
standardDeviation (int[][] grades, int i)
*/

public class homework   {

    /* main method */
    public static void main(String[] args) {
        //empty
    }
    /*
    Students no ||  0     |   1   | ...   |   29
    ______________________________________________
    midterm     ||  100   |   90  | ...   |   100
    ----------------------------------------------
    project     ||  100   |   80  | ...   |   100
    ----------------------------------------------
    final       ||  100   |   70  | ...   |   100
    */
    /** 1st*/
    static int[][] readGrades()    {
        int[][] gradelist = new int[30][3];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<30; i++)  {
            System.out.print("enter the student number " + i + "'s midterm: ");
            gradelist[i][0] = scanner.nextInt();
            System.out.print("enter the student number " + i + "'s project: ");
            gradelist[i][1] = scanner.nextInt();
            System.out.print("enter the student number " + i + "'s final: ");
            gradelist[i][2] = scanner.nextInt();
       }
       scanner.close();
       return gradelist;
    }

    /** 2nd */
    static char[] calculateGrades(int[][] grades){
        char[] gradeLetter = new char[30];
        for(int i=0; i<30; i++){

            /* first we get avrage of midterm and project
            then avrage of final and midterm-project */
            double avg = grades[i][0] * 0.6 + grades[i][1] * 0.4;
            avg = grades[i][2] * 0.6 + avg * 0.4;
            if (avg >= 90) {
                gradeLetter[i] = 'A';
            }
            else if (avg >= 80) {
                gradeLetter[i] = 'B';
            }
            else if (avg >= 70) {
                gradeLetter[i] = 'C';
            }
            else if (avg >= 60) {
                gradeLetter[i] = 'D';
            }
            else {
                gradeLetter[i] = 'F';
            }
        }
       return gradeLetter;
    }

    /** 3rd */
    static double mean(int[][] grades, int i)  {
        double sum =0;
        if(i < 1 || 3 < i)
            return -1;
        else    {
            for(int j = 0; j < grades.length; j++)
                sum += grades[j][i];
        }
        return sum / grades.length;
    }

    /** 4th */
    static double standardDeviation (int[][] grades, int i) {
        /*
        \begin{array}{l}s =\sqrt{\frac{1}{n-1}\sum_{i=1}^{n}(x_i-\overline{x})^2}\end{array}
        */
        double sum =0;
        double mean = mean(grades, i);
        for(int j = 0; j < grades.length; j++)
            sum += Math.pow((grades[j][i] - mean), 2);
        return (Math.sqrt(sum/grades.length));
    }
}
