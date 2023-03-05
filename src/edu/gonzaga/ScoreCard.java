///* Author: Maya Tiu
// * Class: CPSC 224 01
// * Date: 03/02/23
// * Description: This file is a class for a Scorecard used in the game Yahtzee
// */
//
//package edu.gonzaga;
//
//import java.util.ArrayList;
//
//public class Scorecard
//{
//    private final int numSides = 0;
//    int dice = this.numSides;
//    Die die = new Die();
//
//    public void printSortedHand(int[] hand, int diceInPlay)
//    {
//        System.out.println("Here is your sorted hand: ");
//
//        for(int dieNum = 0; dieNum < diceInPlay; dieNum++)
//        {
//            System.out.print(hand[dieNum] + " ");
//        }
//    }
//
//    public static void printScores(ArrayList<Die> setOfDice)
//    {
//        setOfDice.sort(null);
//        System.out.print("Here is your sorted hand:");
//        viewTheDice(setOfDice);
//        ScoreLines scoreSheet = new ScoreLines(setOfDice);
//        System.out.printf("Score " + "%d" + "on the 1 line " + "%n", scoreSheet.getOneLine());
//        System.out.printf("Score %d on the 2 line%n", scoreSheet.getTwoLine());
//        System.out.printf("Score %d on the 3 line%n", scoreSheet.getThreeLine());
//        System.out.printf("Score %d on the 4 line%n", scoreSheet.getFourLine());
//        System.out.printf("Score %d on the 5 line%n", scoreSheet.getFiveLine());
//        System.out.printf("Score %d on the 6 line%n", scoreSheet.getSixLine());
//        System.out.printf("Score %d on the 3 of a Kind line%n", scoreSheet.getThreeOfAKindLine());
//        System.out.printf("Score %d on the 4 of a Kind line%n", scoreSheet.getFourOfAKindLine());
//        System.out.printf("Score %d on the Full House line%n", scoreSheet.getFullHouseLine());
//        System.out.printf("Score %d on the Small Straight line%n", scoreSheet.getSmallStraightLine());
//        System.out.printf("Score %d on the Large Straight line%n", scoreSheet.getLargeStraightLine());
//        System.out.printf("Score %d on the Yahtzee line%n", scoreSheet.getYahtzeeLine());
//        System.out.printf("Score %d on the Chance line%n", scoreSheet.getChanceLine());
//        System.out.println();
//    }
//
//    private static void viewTheDice(ArrayList<Die> setOfDice)
//    {
//        return viewTheDice(Die);
//    }
//    }