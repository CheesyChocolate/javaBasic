public class Part1 {
//    public static void main(String[] args) {
//        int x = 1; // x represents an int value
//        int[] y = new int[10]; // y represents an array of int values
//        m(x, y); // Invoke m with arguments x and y
//        System.out.println("x is " + x);
//        System.out.println("y[0] is " + y[0]);
//    }
//    public static void m(int number, int[] numbers) {
//        number = 1001; // Assign a new value to number
//        numbers[0] = 5555; // Assign a new value to numbers[0]
//    }
/////////////////////////////////////////////////////////////////////////////
//public static void main(String[] args) {
//    int[] a = {1, 2};
//
//    // Swap elements using the swap method
//    System.out.println("Before invoking swap");
//    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
//    swap(a[0], a[1]);
//    System.out.println("After invoking swap");
//    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
//
//    // Swap elements using the swapFirstTwoInArray method
//    System.out.println("Before invoking swapFirstTwoInArray");
//    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
//    swapFirstTwoInArray(a);
//    System.out.println("After invoking swapFirstTwoInArray");
//    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
//}
//
//    /** Swap two variables */
//    public static void swap(int n1, int n2) {
//        int temp = n1;
//        n1 = n2;
//        n2 = temp;
//    }
//
//    /** Swap the first two elements in the array */
//    public static void swapFirstTwoInArray(int[] array) {
//        int temp = array[0];
//        array[0] = array[1];
//        array[1] = temp;
//    }
    /////////////////////////////////////////////////////////////////////////////
//    public static int[] reverse(int[] list) {
//        int[] result = new int[list.length];
//        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
//            result[j] = list[i];
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] list1 = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < list1.length; i++) {
//            System.out.print(list1[i] + " ");
//        }
//        System.out.println("\n-------------------");
//        int[] list2 = reverse(list1);
//        for (int i = 0; i < list2.length; i++) {
//            System.out.print(list2[i] + " ");
//        }
//    }
    ////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        int size=50;
        int [] primenumber =new int[size];

        int cnt=0;

        for (int i = 2; cnt!=size; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) prime=false;
            }
            if (prime) {
                System.out.print(i+"-");
                primenumber[cnt]=i;
                cnt++;
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////
}
