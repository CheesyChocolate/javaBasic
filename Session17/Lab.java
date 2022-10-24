package Session17;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class Lab {

    /* main method */
    public static void main(String[] args) {
        //empty
    }

    /* You are given a mapping which maps a child to 
    his/her dad. Each person is uniquely represented with 
    his/her ID number, which is just some string of 
    characters. Your task is to find out how many 
    children each dad has.
    • In Java terms, you should write a function which 
    takes a parameter of type HashMap<String, String> 
    and returns an object of type HashMap<String, Integer>. */
    static HashMap<String, Integer> childrenCount(HashMap<String, String> dadMap)   {
        HashMap<String, Integer> counts = new HashMap<>();
        for(String child: dadMap.keySet()) {
            String dad = dadMap.get(child);
            if(counts.containsKey(dad)) // not the first child
                counts.put(dad, counts.get(dad) + 1);
            else
                // the first child
                counts.put(dad, 1);
        }
        return counts;
    }

    /* Imagine that you work in a hypothetical village and 
    your job is to arrange marriages of young people. You 
    get two mappings from the delegates. One of them 
    maps boys to girls, showing which boy wants to 
    marry which girl, and the other is vice versa. Your 
    task is to find out mutual mappings (A loves B and B 
    loves A), so you can declare their marriage.
    Assume that each person is represented with names 
    in the lists and no two people have the same name in */
    static HashMap<String, String> marry(HashMap<String, String> boyzList, HashMap<String, String> girlzList)   {
        HashMap<String, String> marriages = new HashMap<>();
        for(String boy: boyzList.keySet()) {
            String girl = boyzList.get(boy);
            if(girlzList.containsKey(girl) && girlzList.get(girl).equals(boy))
                marriages.put(boy, girl);
            else;
                // boy listens a love song
        }
        return marriages;
    }

    /* Consider a set of matryushka dolls each of which has a 
    unique name. Assume that each doll is either small or 
    medium or large in size. You are given two mappings. 
    The first mapping maps big dolls to medium dolls, 
    indicating which doll contains which. The second 
    mapping maps medium dolls to small dolls, with the 
    same meaning as that of first. Your task is to come up 
    with a map from big dolls to small dolls showing 
    containment information.
    Note that there may be a big doll containing a medium 
    doll which does not contain any small doll. For such 
    cases you should map big doll to void. */
    static HashMap<String, String> matryushka(HashMap<String, String> bigToMedium, HashMap<String, String> mediumToSmol)    {
        HashMap<String, String> bigToSmol = new HashMap<>();
        for(String bigDoll: bigToMedium.keySet()) {
            String mediumDoll = bigToMedium.get(bigDoll);
            if(mediumToSmol.containsKey(mediumDoll))
                bigToSmol.put(bigDoll, mediumToSmol.get(mediumDoll));
            else
                bigToSmol.put(bigDoll, null);
        }
        return bigToSmol;
    }
    /* You and your n friends decided to play a deadly game. You bought 
    n bombs. Each bomb has a little machinery connected to a button 
    such that when the button is pressed the bomb explodes with 
    probability p.
    You form a circle to play this game. The game is played in turns, in 
    each turn the current player presses the button and if he stays 
    alive he hands the bomb to the friend on his left or right, with 
    equal probability. When a friend dies, a random friend from the 
    remaining pool takes a new bomb and the game continues until 
    one person is left, which is the winner of the game. Game starts 
    with a random friend.
    Assume that a bomb kills only the person who holds it.
    Write code to simulate this game. */
    static boolean prob(double p) {
        return Math.random() < p;
    }
    static String fancySuicide(LinkedList<String> friends, double p) {
        Random r = new Random();
        int turn = r.nextInt(friends.size());
        while(friends.size() > 1) {
            if(prob(p)) {
                friends.remove(turn);
                turn = r.nextInt(friends.size());
            }
            else if(prob(.5))
                turn = (turn + 1) % friends.size();
            else// ensure that the result of % is non-negative
                turn = (turn + friends.size() - 1) % 
            friends.size();
        }
        return friends.getFirst();
    }

    /* You have a bag which contains n black, n red balls. As 
    your choice of n gets bigger, doing the following 
    experiment many times and taking the average will 
    yield a certain value, what is it?
    Experiment:  Randomly draw balls from the bag one-
    by-one until one of the colors is completely depleted. 
    Then count the remaining balls in the bag. */
    static int drawBalls(LinkedList<String> balls) {
        Random r = new Random();
        int redBalls = balls.size() / 2; 
        int blackBalls = balls.size() / 2;
        while(redBalls > 0 && blackBalls > 0) {
            int randBall = r.nextInt(balls.size());
            /*if(balls.get(randBall) == "red")
            is just checking memory location */
            if((balls.get(randBall)).equals("red"))
                redBalls--;
            else
                blackBalls--;
            balls.remove(randBall);
        }
        return redBalls + blackBalls;
    }

}