//made by Suren
package Session14;

public class project1V1 {
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
        int correct=0, incorrect=0;
        for(int i=0; i<10000; i++)    {     //terverce array
            if (i < 1000)   {       //eliminate numbers with less than four digits
                arr[i]=false;
                incorrect++;
            }
            else if (checker(i)) {      //finds numbers that obey the rule
                arr[i]=true;
                correct++;
                System.out.print(i + "\t");
            }
            else    {       //eliminate the rest of the numbers
                arr[i]=false;
                incorrect++;
            }

        }
        System.out.println("\n" + "the number of true values are: " + correct);
        System.out.println("the number of false values are: " + incorrect);
    }
}
