//made by Suren
import java.util.ArrayList;

public class project1V2 {
    //a method that checks if each digit of enterd four digit number is similar or not
    public static boolean checker(int i){
        int first=  i /1000;
        int second= i/100%10;
        int third=  i/10%10;
        int forth=  i%10;
        if (first!=second && first!=third && first!=forth && second!=third && second!=forth && third!=forth)
            return true;
        else
            return false;
    }
    public static void main(String Args[])  {
        boolean[] arr = new boolean[10000];     //make an array with 10000 element
        ArrayList<Integer> correct = new ArrayList<Integer>();
        ArrayList<Integer> incorrect = new ArrayList<Integer>();
        for(int i=0; i<10000; i++)    {     //terverce array
            if (i < 1000)   {       //eliminate numbers with less than four digits
                arr[i]=false;
                incorrect.add(i);
            }
            else if (checker(i)) {      //finds numbers that obey the rule
                arr[i]=true;
                correct.add(i);
            }
            else    {       //eliminate the rest of the numbers
                arr[i]=false;
                incorrect.add(i);
            }
        }
        System.out.println("from here true values are : \n" + correct);
        System.out.println("form here false values are: \n" + incorrect);
        System.out.println("the number of true values: " + correct.size());
        System.out.println("the number of false values: " + incorrect.size());
       }
}
