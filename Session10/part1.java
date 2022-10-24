package Session10;

//import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter three int value: ");
        // int n1 = scanner.nextInt();
        // int n2 = scanner.nextInt();
        // int n3 = scanner.nextInt();
        // float avg = ((float) n1 + n2 + n3) / 3;
        // System.out.println("Average: " + avg);
        // if (n1 < avg) {
        // System.out.println(n1 +" is less than average");
        // }
        // if (n2 < avg) {
        // System.out.println(n2 +" is less than average");
        // }
        // if (n3 < avg) {
        // System.out.println(n3 +" is less than average");
        // }
        /////////////////////////////////////////////////////////////////
        int size = 10;
        int[] arr = new int[size];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("Enter int value " + (i+1) + ": ");
            // arr[i] = scanner.nextInt();
            arr[i] = (int) (Math.random() * 100);
            sum += arr[i];
        }
        int max_index = -1;
        int min_index = -1;
        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }
        double avg = sum / arr.length;
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max + " at index " + max_index);
        System.out.println("Min: " + min + " at index " + min_index);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                System.out.println(arr[i] + " is less than average");
            }
        }
        System.out.println("Before swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
        int tmp;
        tmp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index] = tmp;
        System.out.println("\nAfter swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }
    }
}
