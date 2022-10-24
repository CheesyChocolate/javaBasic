package Session16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab {
    
    /* main method */
    public static void main(String[] args) {
        //empty
    }

    /* Write a function which takes an ArrayList of 
    characters and removes all ‘e’ characters in it 
    without changing the order of other elements. 
    (removeAll() method is not allowed) */
    public static void removeAllSimillar(){
        ArrayList<Character> arl = new ArrayList<>();
        for(int i=0; i<10; i++)
            arl.add((char) 
        Math.round(Math.random()*3+100) );
        System.out.println(arl);
        cleanse(arl);
        System.out.println(arl);
    }
    static void cleanse(ArrayList<Character> arl) {
        // your code
        while(arl.remove(Character.valueOf('e')));
    }

    /* Write a function which takes a positive 
    integer and returns all its positive divisors.
    e.g.
    divisors(20) = [1, 2, 4, 5, 10, 20]
    divisors(4) = [1, 2, 4] */
    static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1; i<=n; i++)
            if(n%i==0)
                res.add(i);
        return res;
    }

    /* Write a function which takes an array of 
    integers and returns an ArrayList of integers 
    such that for each element in the array a fair 
    coin is tossed to decide whether or not to 
    include it in the ArrayList.
    e.g.
    randomSubset([2, 3, 5, 6]) returns [2, 6] (maybe) 
    randomSubset([2, 3, 5, 6]) returns [] (maybe) */
    static ArrayList<Integer> randomPick(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int elem: arr)
            if(Math.random() < 0.5)
                res.add(elem);
        return res;
    }

    /* Write a function which takes an ArrayList of 
    integers and a rotation amount (integer) and 
    rotates the ArrayList by the amount given.
    e.g.
    rotate([3,1,5,7], 0)  [3,1,5,7]
    rotate([2,7,4,4,4], 2)  [4,4,2,7,4]
    rotate([2,5,7,2,1,3], -1)  [5,7,2,1,3,2] */
    static void rotateSolution01(ArrayList<Integer> arl, int k) {
        if(k < 0)
            for(int i=0; i<-k; i++)
                arl.add(arl.remove(0));
        else
            for(int i=0; i<k; i++)
                arl.add(0, arl.remove(arl.size()-1));
    }

    static void rotateSolution02(ArrayList<Integer> arl, int k) {
    // This is also OK but harder to understand
        for(int i=0; i<-k; i++)
            arl.add(arl.remove(0));
        for(int i=0; i<k; i++)
            arl.add(0, arl.remove(arl.size()-1));
    }

    /* Write a program which takes integers from 
    user until user enters a 0 and displays them in 
    ascending order (0 won’t be displayed). */
    public static void sortInputData(){
        Scanner input = new Scanner(System.in);
        // get numbers
        ArrayList<Integer> arl = new ArrayList<>();
        int next;
        while((next = input.nextInt()) != 0)
            arl.add(next);
        // sort them
        Collections.sort(arl);
        // display
        for(int num: arl)
            System.out.println(num);
        input.close();
    }
}