/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/02/23
 * Description: This file is a class for a Player in the game Yahtzee
 */

package edu.gonzaga;
import java.io.IOException;
import java.util.Scanner;

public class Player
{

    //banner that prints out when the game starts
    public boolean playGame() throws IOException {
        System.out.println("***************************************");
        System.out.println("*                                     *");
        System.out.println("*       WELCOME TO YAHTZEE            *");
        System.out.println("*          by: Maya Tiu               *");
        System.out.println("*        [Copyright: 2023]            *");
        System.out.println("*                                     *");
        System.out.println("***************************************");

        //getting user/player name
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String playerName = in.next();

        if(!playerName.equals("-"))
        {
            System.out.println("Hello " + playerName);
        }
        else
        {
            playerName = "Player 1";
            System.out.println("Hello " + playerName);
        }

        //game starts
        System.out.println("Would you like to play Yahtzee? (y/n)");
        String play1 = in.next();
        char play = play1.charAt(0);
        if(play == 'y')
        {
            TopScorersList topScorers = new TopScorersList();
            topScorers.readFile();
            topScorers.printTopTen();
            HandOfDice dice = new HandOfDice();
            dice.rollHand();
            dice.sortHand();
            UpperScoreCard upcard = new UpperScoreCard(dice);
            upcard.upScoreCard();
            LowerScoreCard lowcard = new LowerScoreCard(dice);
            lowcard.lowScoreCard();
            CurrentScoreCard currentscore = new CurrentScoreCard();
            currentscore.getScore(dice);
            TopScorer player = new TopScorer(playerName, currentscore.currentScore);
            topScorers.printCurrentPlayerPlace(player);
            topScorers.saveTopTenPlayers();
        }
        else if(play == 'n')
        {
            System.out.println("Game has ended...Goodbye!");
        }
        else
        {
            System.out.println("Play again soon!");
            return false;
        }
        return playGame();
    }

    public void savePlayerName(String crandall)
    {
        savePlayerName("Crandall");
    }

    public String getPlayerName()
    {
        return null;
    }
}