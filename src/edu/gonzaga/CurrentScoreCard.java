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
    //    int totalScore;
    int count;
    int maxCount;

    public int getScore() {
        for (count = 1; count <= 13; count++) {
            HandOfDice dice = new HandOfDice();

            System.out.println(" ");
            System.out.println("**********Menu of Scorecard Choices**********");
            System.out.println("1. Ones (1S)           7. Three of a Kind (3K)");
            System.out.println("2. Twos (2S)           8. Four of a Kind (4K)");
            System.out.println("3. Threes (3S)         9. Five of a Kind (5K)");
            System.out.println("4. Fours (4S)          10. Full House (FH)");
            System.out.println("5. Five (5S)           11. Large Straight (LS)");
            System.out.println("6. Sixes (6S)          12. Small Straight (SS)");
            System.out.println("                       13. Yahtzee (YH)");
            System.out.println("                       14. Chance (CH)");
            System.out.println("-*********************************************");
            System.out.println(" ");

            //user chooses a line to score based in the menu
            Scanner in = new Scanner(System.in);
            System.out.println("Which scoreline would you like to count?");

            scoreline = in.next();
            Integer scoreline2 = Integer.valueOf(scoreline);

            if (scoreline2 <= 6)
            {
                UpperScoreCard upcard = new UpperScoreCard(dice);
                int scoreChosen = upcard.chosenScore;
                currentScore += scoreChosen;
            }
            else if (scoreline2 == 7)
            {
                LowerScoreCard lowcard = new LowerScoreCard(dice);
                int maxC = lowcard.returnMax();
                currentScore += maxC;
            }
            else if (scoreline2 == 8)
            {
                LowerScoreCard lowcard = new LowerScoreCard(dice);
                int maxC = lowcard.returnMax();
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
                currentScore = 0;
            }

            int totalScore = currentScore;
            System.out.println("Your total game score is: " + totalScore);
            dice.rollHand();
            dice.sortHand();
            UpperScoreCard upcard = new UpperScoreCard(dice);
            upcard.upScoreCard();
            LowerScoreCard lowcard = new LowerScoreCard(dice);
            lowcard.lowScoreCard();
        }
        return 0;
    }

    public int totalScore()
    {
        return totalScore();
    }
}