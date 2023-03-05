/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/02/23
 * Description: This file is a class for the LowerScoreCard used in the game Yahtzee
 */
package edu.gonzaga;

public class LowerScoreCard extends CurrentScoreCard
{
    HandOfDice hand;
    int total;
    public LowerScoreCard(HandOfDice hand)
    {
        this.hand = hand;
    }

    public int maxOfAKind()
    {
        maxCount = 0;
        int currentCount;

        for(int dieValue = 1; dieValue <= 6; dieValue++)
        {
            currentCount = 0;

            for(int diePosition = 0; diePosition < 5; diePosition++)
            {
                if(hand.handArray.get(diePosition) == dieValue)
                {
                    currentCount++;
                }
            }
            if(currentCount > maxCount)
            {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }
    public int returnMax()
    {
        return returnMax();
    }

    public int totalAllDice()
    {
        total = 0;

        for(int diePosition = 0; diePosition < 5; diePosition++)
        {
            total += hand.handArray.get(diePosition);
        }
        return total;
    }

    public int returnTotal()
    {
        return total;
    }

    public int straights()
    {
        int maxLength = 1;
        int currLength = 1;

        for(int counter = 0; counter < 4; counter++)
        {
//            HandOfDice hand = new HandOfDice();
            if(hand.handArray.get(counter) + 1 == hand.handArray.get(counter + 1))
                currLength++;
            else if(hand.handArray.get(counter) + 1 < hand.handArray.get(counter + 1))
                currLength = 1;
            if(currLength > maxLength)
                maxLength = currLength;
        }
        return maxLength;
    }

    public boolean fullHouse()
    {
        boolean fullHouse = false;
        boolean threeOfAKind = false;
        boolean twoOfAKind = false;
        int currentCount;

        for(int dieValue = 1; dieValue <= 6; dieValue++)
        {
            currentCount = 0;

            for(int diePosition = 0; diePosition < 5; diePosition++)
            {
                if(hand.handArray.get(diePosition) == dieValue)
                    currentCount++;
            }
            if(currentCount == 2)
            {
                twoOfAKind = true;
            }

            if(currentCount == 3)
            {
                threeOfAKind = true;
            }
        }

        if(twoOfAKind && threeOfAKind)
        {
            fullHouse = true;
        }
        return fullHouse;
    }

    public void lowScoreCard()
    {
        //Three of a Kind
        if(maxOfAKind() >= 3)
        {
            System.out.println("Score " + totalAllDice() + " on the Three of a Kind Line");
        }
        else
        {
            System.out.println("Score 0 on the Three of a Kind Line");
        }

        //Four of a Kind
        if(maxOfAKind() >= 4)
        {
            System.out.println("Score " + totalAllDice() + " on the Four of a Kind Line");
        }
        else
        {
            System.out.println("Score 0 on the Four of a Kind Line");
        }

        //Full House
        if(fullHouse())
        {
            System.out.println("Score 25 on the Full House Line");
        }
        else
        {
            System.out.println("Score 0 on the Full House Line");
        }

        //Small Straight
        if(straights() >= 4)
        {
            System.out.println("Score 30 on the Small Straight Line");
        }
        else
        {
            System.out.println("Score 0 on the Small Straight Line");
        }

        //Yahtzee
        if(straights() >= 5)
        {
            System.out.println("Score 50 on the Yahtzee Line");
        }
        else
        {
            System.out.println("Score 0 on the Yahtzee Line");
        }
        System.out.println("Score " + totalAllDice() + " on the Chance Line");
    }

    private String total()
    {
        return total();
    }
}