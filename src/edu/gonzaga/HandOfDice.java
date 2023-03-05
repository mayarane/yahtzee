/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/02/23
 * Description: This file is a class for the HandOfDice used in the game Yahtzee
 */
package edu.gonzaga;

import java.util.Scanner;
import java.lang.String;
import java.util.*;
import java.util.Arrays;

public class HandOfDice extends Die
{

    public HandOfDice()
    {
        for(int i = 0; i < DICEINPLAY; i++)
        {
            handArray.add(0);
        }
    }

    private static final int DICEINPLAY = 5;
    ArrayList<Integer> handArray = new ArrayList<Integer>();
    private String keep;

    public void rollHand()
    {
        keep = "nnnnn";
        int turn = 1;

        while(turn < 4 && keep.compareTo("yyyyy") != 0)
        {
            for(int dieNum = 0; dieNum < DICEINPLAY; dieNum++)
            {
                if(keep.charAt(dieNum) != 'y')
                {
                    roll();
                    handArray.set(dieNum, getSideUp());
                }
            }

            System.out.print("Your roll was: ");

            for(int dieNum = 0; dieNum < DICEINPLAY; dieNum++)
            {
                System.out.print(handArray.get(dieNum));
                System.out.print(" ");
            }

            System.out.println();

            if(turn < 3)
            {
                Scanner in = new Scanner(System.in);
                System.out.println("Enter dice to keep (y or n)");
                keep = in.next();

                if(keep.charAt(0) == 'q')
                {
                    CurrentScoreCard currents = new CurrentScoreCard();
                    int scoreTotal = currents.totalScore();
                    System.out.println("Your current score is: " + scoreTotal);
                    System.out.println("The game has ended...Goodbye!");
                    System.exit(0);
                }
            }
            turn++;
        }
    }

    public void sortHand()
 {
        Collections.sort(handArray);
        System.out.print("Here is your sorted hand: ");

        for(int dieNum = 0; dieNum < DICEINPLAY; dieNum++)
        {
            System.out.print(handArray.get(dieNum) + " ");
        }
    }
}