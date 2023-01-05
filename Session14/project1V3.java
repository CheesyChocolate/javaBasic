//made by suren
public class project1V3 {
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
    // public static int[] repeatCounter(boolean[] arr,boolean cond)    {

    // }
    public static void main(String Args[])  {
        boolean[] arr = new boolean[10000];
        for(int i=0; i<10000; i++)    {
            if (i < 1000)
                arr[i]=false;
            if (checker(i))
                arr[i]=true;
            else
                arr[i]=false;

        }
    }
}
