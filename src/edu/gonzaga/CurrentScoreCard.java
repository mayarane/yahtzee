/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/02/23
 * Description: This file is a class for a Die used in the game Yahtzee
 */

package edu.gonzaga;

import java.util.Scanner;

public class CurrentScoreCard {
    String scoreline;
    int currentScore;
    int count;
    int maxCount;

    public void getScore(HandOfDice dice)
    {
        for (count = 1; count <= 13; count++)
        {
            System.out.println(" ");
            System.out.println("**********Menu of Scorecard Choices**********");
            System.out.println("Ones (1)                Three of a Kind (7)");
            System.out.println("Twos (2)                Four of a Kind (8)");
            System.out.println("Threes (3)              Five of a Kind (9)");
            System.out.println("Fours (4)               Full House (10)");
            System.out.println("Five (5)                Large Straight (11)");
            System.out.println("Sixes (6)               Small Straight (12)");
            System.out.println("                        Yahtzee (13)");
            System.out.println("                        Chance (14)");
            System.out.println("**********************************************");
            System.out.println(" ");

            Scanner in = new Scanner(System.in);
            System.out.println("Which scoreline would you like to count? (enter the number in the parentheses)");
            scoreline = in.next();
            Integer scoreline2 = Integer.valueOf(scoreline);

            if (scoreline2 <= 6)
            {
                UpperScoreCard upcard = new UpperScoreCard(dice);
                int scoreChosen = upcard.chosenScore(scoreline2);
                currentScore += scoreChosen;
            }
            else if (scoreline2 == 7)
            {
                LowerScoreCard lowcard = new LowerScoreCard(dice);
                int maxC = lowcard.totalAllDice();
                currentScore += maxC;
            }
            else if (scoreline2 == 8)
            {
                LowerScoreCard lowcard = new LowerScoreCard(dice);
                int maxC = lowcard.totalAllDice();
                currentScore += maxC;
            }
            else if (scoreline2 == 9)
            {
                currentScore += 25;
            }
            else if (scoreline2 == 10)
            {
                currentScore += 40;
            }
            else if (scoreline2 == 11)
            {
                currentScore += 30;
            }
            else if (scoreline2 == 12)
            {
                currentScore += 50;
            }
            else if (scoreline2 == 13)
            {
                LowerScoreCard lowcard = new LowerScoreCard(dice);
                int total = lowcard.returnTotal();
                currentScore += total;
            }
            else
            {
                System.out.print("Enter a valid option please");
            }

            System.out.println("Your total game score is: " + currentScore);
            dice.rollHand();
            dice.sortHand();
            UpperScoreCard upcard = new UpperScoreCard(dice);
            upcard.upScoreCard();
            LowerScoreCard lowcard = new LowerScoreCard(dice);
            lowcard.lowScoreCard();
        }
    }

    public int totalScore()
    {
        return totalScore();
    }
}