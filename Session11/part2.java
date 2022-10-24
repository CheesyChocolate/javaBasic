package Session11;

public class part2 {
//    Binary search
//    public static int binarySearch(int[] arr, int key) {
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (key == arr[mid]) {
//                return mid;
//            } else if (key < arr[mid]) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return -1;
//    }
///////////////////////////////////////////////////////////////
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
    // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
    // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] list1 = {11, 66, 68, 3, 99, 4, 96, 5,6};
//        selectionSort(list1);
        System.out.println(java.util.Arrays.toString(list1));
        java.util.Arrays.sort(list1);
        System.out.println(java.util.Arrays.toString(list1));
//        int i = 0;
//        while (i<list1.length) {
//            System.out.print(list1[i] + " ");
//            i++;
//        }


    }
}
