/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 02/26/23
 * Description: This file is the main file for the game Yahtzee
 */
/* (C)2023 */
package edu.gonzaga;

import java.io.IOException;

public class Yahtzee
{
    public static void main(String[] args) throws IOException
    {
        Player yahtzee = new Player();
        yahtzee.playGame();
    }

    public int calculateScore(int[] dice, Object yahtzee)
    {
        return 0;
    }
}