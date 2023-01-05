public class Lab {

    /* main mathod */
    public static void main(String[] args) {
        //empty
    }

    /* Write a function which takes a rectangular
    integer array and two indices i, j and returns
    the element of the array which is located at
    the intersection of the ith row and jth column. */
    static int get(int[][] arr, int i, int j)   {
        return arr[i][j];
    }

    /* Write a function which grades a multiple choice
    test. Assume that every student answers every
    question. Each correct answer gives +1 point and
    each wrong answer costs -1/4 points. */
    static double[] grade(char[][] answers, char[] key) {
        // your code
        double[] grades = new double[answers.length];
        for(int i=0; i<answers.length; i++)
            for(int j=0; j<key.length; j++)
                if(answers[i][j] == key[j])
                    grades[i] += 1;
                else
                    grades[i] -= (double)1/4;
        return grades;
    }
    public static void graedData(){
        char[][] answers = {
            {'A','D','E','E','A','D'}, // Student 1
            {'D','E','E','A','D','D'}, // Student 2
            {'A','D','E','E','D','D'}, // Student 3
            {'C','C','E','A','C','A'}, // Student 4
            {'A','D','E','C','C','B'}, // Student 5
            {'A','E','E','A','E','B'}, // Student 6
            {'C','B','A','A','D','B'}  // Student 7
        };
        char[] key = {'A','D','E','A','C','B'};
        double[] grades = grade(answers, key);
        for(int i=0; i<grades.length; i++)
            System.out.println(grades[i]);
    }

    /* Write a program which takes a 2-d double array
    representing points in 2-d space and prints the
    closest two points to the screen. */
    static double dist(double[] p1, double[] p2) {
        return Math.sqrt( Math.pow(p1[0]-p2[0], 2) + Math.pow(p1[1]-p2[1], 2));
    }
    public static void findsClosest()   {
        double[][] points = {
            {1.2, 2.3},
            {-2, -1},
            {-.3, 3.2},
            {.11, .6},
            {.1, -3},
            {-2.1, 2.2},
            {-1.6, 0.8},
            {4.2, 1.1},
            {3, 2.1},
            {-2.1, -1.5}
        };
        // your code
        double minDist = dist(points[0], points[1]);
        double[] p1 = points[0];
        double[] p2 = points[1];
        for(int i=0; i<points.length; i++)
            for(int j=i+1; j<points.length; j++)
                if(dist(points[i], points[j]) < minDist) {
                    minDist = dist(points[i], points[j]);
                    p1 = points[i];
                    p2 = points[j];
                }
        System.out.println(p1[0] + ", " + p1[1]);
        System.out.println(p2[0] + ", " + p2[1]);
    }

    /* You are supposed to write a method which finds the students
    who got an AA grade from the Programming Languages - II
    course.
    Names of students will be given as a string array and their
    grades (Midterm, BirDeha, Project and Final in that order) as a
    2-d integer array. To get an AA, a student must have a final
    average of at least 90. Your method should print all the
    students which got an AA to the screen (returns nothing). The
    weights are as follows:
    Midterm 25%
    BirDeha 10%
    Project 25%
    Final   40% */
    public static void studentsData() {
        String[] students = {
            "ALI",
            "MAHMUT",
            "AYŞE",
            "ZEYNEP",
            "FATMA",
            "KERİM",
            "OSMAN",
            "YASEMİN",
            "NİYAZİ",
            "RECEP",
            "KAMİL"
        };
        int[][] grades = {
            {80, 90, 70, 100},
            {50, 60, 40, 80},
            {100, 50, 70, 60},
            {100, 90, 95, 100},
            {80, 80, 85, 75},
            {42, 66, 84, 94},
            {79, 91, 89, 100},
            {100, 85, 88, 75},
            {25, 99, 85, 40},
            {63, 59, 66, 33},
            {87, 100, 100, 96}
        };
        printAAs(students, grades);
    }
    static double calcAvg(int[] grades) {
        return grades[0] * 0.25 +
            grades[1] * 0.1 +
            grades[2] * 0.25 +
            grades[3] * 0.4
        ;
    }
    static void printAAs(String[] students, int[][] grades) {
        // your code
        for(int i=0; i<students.length; i++) {
            if(calcAvg(grades[i]) >= 90)
                System.out.println(students[i]);
        }
    }

    /* • Consider an n by n table. For any cell in the
    table we define the neighborhood of a cell to
    be the cells located at right, left, up, down and
    all 4 diagonals (if they exist). Write a function
    which takes integers n, i, j and returns the
    number of neighbors of the cell, which is
    located at ith row and jth column. */
    static int countNeighbors(int n, int i, int j) {
        // check the edges
        int cond = 0;
        if(i+1 == n)
            cond++;
        if(i == 0)
            cond++;
        if(j+1 == n)
            cond++;
        if(j == 0)
            cond++;
        switch(cond) {
            case 4: return 0; // 1x1 table
            case 2: return 3; // corner
            case 1: return 5; // edge
            default: return 8;// inside
        }
    }

    /* Write a function which given two square
    integer arrays and two integers i,j; writes the
    smaller array’s content into the bigger one such
    that the (0,0) cell of the small array coincides
    with (i,j) cell of the bigger array. You can
    assume that the first parameter is the bigger
    and the second parameter is the smaller array.
    (Don’t allocate new space, overwrite the bigger
    array and return it.)
    e.g.
    Input: paste(arr1, arr2, i, j)
    where
    arr1 arr2 i j
    123  00   1 1
    654  00
    789
    Output:
    123
    600
    700 */
    static int[][] paste(int[][] big, int[][] smol, int I, int J){
        int smolHeight = smol.length;
        int smolWidth = smol[0].length;
        for(int i=I; i<I+smolHeight; i++)
            for(int j=J; j<J+smolWidth; j++)
                big[i][j] = smol[i-I][j-J];
        return big;
    }
}
