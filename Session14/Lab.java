package Session14;

import java.util.Scanner;

public class Lab {

    /* main method */
    public static void main(String[] args) {
        System.out.println(getInput());
    }

    /* Write a function which takes integers from 
    user, store them in an array and returns the 
    array. The first number user gives is the 
    number of integers she is planning to give 
    further. */
    static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        // Get the number of inputs
        int count = sc.nextInt();
        // Allocate required amount of space
        // and read and store the user input
        int[] data = new int[count];
        for(int i=0; i<count; i++)
            data[i] = sc.nextInt();
        sc.close();
        return data;
    }

    /* Write a program which takes integers from 
    user, and prints them in reverse order. The first 
    integer that user gives will be the number of 
    integers she will give further.
    e.g.
    Input: 
    5 
    2 6 2 3 1
    Output: 
    1 3 2 6 2 */
    public static void reverser()   {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] nums = new int[count];
        for(int i=0; i<count; i++)
            nums[i] = sc.nextInt();
        for(int i=0; i<count; i++)
            System.out.print(nums[count-1-i] + " ");
        sc.close();
    }

    /* Given an integer array and an integer k find 
    out how many pairs are there in the array 
    whose sum is equal to k.
    e.g.
    countPairs([3, 2, 5, 6], 3) = 0
    countPairs([1, 1, 1, 1], 2) = 6 */
    static int pairSum(int[] arr, int k) {
        int count = 0;
        for(int i=0; i<arr.length-1; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i] + arr[j] == k)
                    count++;
        return count;
    }

    /* Write a program which takes sorted integers 
    from user until the user enters an unsorted 
    number. Your program should detect the 
    direction (ascending or descending) of sorting 
    and then looks for an input in the wrong 
    direction. (You can do without arrays.)
    example runs:
    1, 2, 5, 8, 8, 9, 3
    8, 8, 8, 8, 5, 5, 3, 1, 2 */
    public static void tester() {
        Scanner sc = new Scanner(System.in);
        boolean isAsc;
        int prev;
        int cur = sc.nextInt();
        // learn the direction
        do {
            prev = cur;
            cur = sc.nextInt();
        } while(cur == prev);
        isAsc = cur > prev;
        // look for an unsorted number
        do {
            prev = cur;
            cur = sc.nextInt();
        } while(cur > prev == isAsc || cur == prev);
        sc.close();
    }

    /* • Write a function which takes two sorted 
    integer arrays and returns a merged sorted 
    array. (all ascending order)
    e.g.
    sortArrays([4], [1,2,5]) = [1,2,4,5]
    sortArrays([1,2,5], []) = [1,2,5]
    sortArrays([3,5,5,6], [1,6,8]) = [1,3,5,5,6,6,8] */
    static int[] sortArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i=0,j=0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                res[i+j] = arr1[i];
                i++;
            }
            else {
                res[i+j] = arr2[j];
                j++;
            }
        }
        while(i < arr1.length) {
            res[i+j] = arr1[i];
            i++;
        }
        while(j < arr2.length) {
            res[i+j] = arr2[j];
            j++;
        }
        return res;
    }
}