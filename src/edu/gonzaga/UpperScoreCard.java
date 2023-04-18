/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/02/23
 * Description: This file is a class for the UpperScoreCard used in the game Yahtzee
 */
package edu.gonzaga;

public class UpperScoreCard extends CurrentScoreCard
{
    HandOfDice hand;
    int chosenScore;
    int lineNumber = 1;
    int upperScore;

    public UpperScoreCard(HandOfDice hand)
    {
        this.hand = hand;
    }

    public void upScoreCard()
    {
        for (int dieValue = 1; dieValue <= 6; dieValue++)
        {
            int currentCount = 0;

            for (int diePosition = 0; diePosition < 5; diePosition++)
            {
                if (hand.handArray.get(diePosition) == dieValue)
                    currentCount++;
            }
            System.out.println("Score " + dieValue * currentCount + " on the " + dieValue + " line");
            int lineScore = dieValue + currentCount;

            if (lineNumber == lineScore)
            {
                chosenScore = lineScore;
            }
        }

        upperScore += chosenScore;

        if (upperScore >= 63)
        {
            upperScore += 35;
        }
    }

    public int chosenScore(int num)
    {
        for (int diePosition = 0; diePosition < 5; diePosition++)
        {
            if (hand.handArray.get(diePosition) == num)
                chosenScore += num;
        }

        upperScore += chosenScore;

        if (upperScore >= 63)
        {
            upperScore += 35;
        }
        return upperScore;
    }

    public int returnTotal()
    {
        return returnTotal();
    }

    public int getBonusScore()
    {
        return 0;
    }

    public boolean isFull()
    {
        return false;
    }
}