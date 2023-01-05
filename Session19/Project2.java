//made by Suren
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Project2 {
    public static int getRandomElement(HashSet<Integer> Hashset){       //to get a random element from HashSet
        Random random = new Random();
        int randomNumber = random.nextInt(Hashset.size());
        Iterator<Integer> iterator = Hashset.iterator();

        int currentIndex = 0;
        Integer randomElement = null;

        while(iterator.hasNext()){
            randomElement = iterator.next();
            if(currentIndex == randomNumber)
                return randomElement;
            currentIndex++;
        }
        return randomElement;
    }
    public static void main(String Args[])  {        //useing an array with index in conjunction with main HashSet would be better but this project won't allow it
        HashSet<Integer> valid = new HashSet<Integer>();
        int first,second,third,forth;
        for(int i=0; i<10000; i++)    {     //traverse till 10000 and finds numbers that obey rule
            first=  i /1000;
            second= i/100%10;
            third=  i/10%10;
            forth=  i%10;

            if (i>999 && first!=second && first!=third && first!=forth && second!=third && second!=forth && third!=forth)
                valid.add(i);
        }

        Scanner scanner = new Scanner(System.in);

        while(true)    {       //the game
            int choice = getRandomElement(valid);
            first=  choice /1000;
            second= choice/100%10;
            third=  choice/10%10;
            forth=  choice%10;
            int[] choiceArr = {first, second, third, forth};

            System.out.println("You fool I choose  " + choice);         //here is user interface
            System.out.print("Now tell me the correct places(0-4): ");
            int corP = scanner.nextInt();
            System.out.print("And the incorrect ones(0-4): ");
            int incorP = scanner.nextInt();

            if (corP==4)    {
                System.out.println("I AM INEVITABLE MASTERMIND");
                break;
            }

            for(int i=0;i<9999;i++)  {         //traverse the "valid"
                int firstall=  i /1000;
                int secondall= i/100%10;
                int thirdall=  i/10%10;
                int forthall=  i%10;
                int[] allArr = {firstall, secondall, thirdall, forthall};

                int incorPTmp=0,corPTmp=0;
                for(int allIndex=0; allIndex<4; allIndex++)  {      //gives mastermindLike points to the number traversed from "valid"
                    for(int choiceIndex=0; choiceIndex<4; choiceIndex++) {
                       if((allArr[allIndex]==choiceArr[choiceIndex]) && (allIndex==choiceIndex))     corPTmp++;
                       else if(allArr[allIndex]==choiceArr[choiceIndex])    incorPTmp++;
                    }
                }

                if(corP!=corPTmp || incorP!=incorPTmp)  {    //remove the nummber that have diffrent mastermindLike points than user given one
                    valid.remove(i);
                }
            }
        }
        scanner.close();
    }
}
