/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/24/23
 * Description: This file is a class for the Top Scorers in the game Yahtzee
 */

package edu.gonzaga;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TopScorersList
{
    private ArrayList<TopScorer> topPlayers = new ArrayList<TopScorer>();
    public void readFile()
    {
        File file = new File("C:\\Users\\mayar\\OneDrive - Gonzaga University\\Desktop\\CPSC 224\\yahtzee\\yahtzee-mayarane\\yahtzeeSavedScores.dat");

        try
        {
            Scanner scanner = new Scanner(file);
            StringBuilder editedText = new StringBuilder();
            int position = 1;

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                Integer score = Integer.parseInt(parts[0]);
                String name = parts[1];

                TopScorer player = new TopScorer(name, score);
                topPlayers.add(player);
            }
            scanner.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public void printTopTen()
    {
        System.out.print("Top 10 Players\n");

        for(int i = 0; i < topPlayers.size(); i++)
        {
            TopScorer player = topPlayers.get(i);
            System.out.print("#" + (i +1) + " ");
            System.out.println(player.getScore() + " points " + player.getName());
        }
    }

    public void printCurrentPlayerPlace(TopScorer player)
    {
        System.out.println("\nCurrent top scorers place overall: ");
        ArrayList<TopScorer> currentTopPlayers = this.topPlayers;

        int index = -1;

        for(int i = currentTopPlayers.size() - 1; i >= 0; i--)
        {
            if(player.compareTo(currentTopPlayers.get(i)) == 1)
            {
                index = i;
            }
        }
        if(index == -1)
        {
            index = 10;
        }

        if(index == 0)
        {
            currentTopPlayers.add(index, player);
            System.out.print("#" + (index + 1) + " ");
            currentTopPlayers.get(index).printPlayer();
            System.out.print("#" + (index + 2) + " ");
            currentTopPlayers.get(index + 1).printPlayer();
            currentTopPlayers.remove(index);
        }
        else if(index == 10)
        {
            currentTopPlayers.add(player);
            System.out.print("#" + (index) + " ");
            currentTopPlayers.get(index - 1).printPlayer();
            System.out.print("#" + (index + 1) + " ");
            currentTopPlayers.get(index).printPlayer();
            currentTopPlayers.remove(index);
        }
        else
        {
            currentTopPlayers.add(index, player);
            System.out.print("#" + (index) + " ");
            currentTopPlayers.get(index - 1).printPlayer();
            System.out.print("#" + (index + 1) + " ");
            currentTopPlayers.get(index).printPlayer();
            System.out.print("#" + (index + 2) + " ");
            currentTopPlayers.get(index + 1).printPlayer();
            currentTopPlayers.remove(index);
        }
    }

    public void saveTopTenPlayers() throws IOException
    {
        //takes filename to write the top ten to as parameter
        File oldFile = new File("C:\\Users\\mayar\\OneDrive - Gonzaga University\\Desktop\\CPSC 224\\yahtzee\\yahtzee-mayarane\\yahtzeeSavedScores.dat");
        File file = new File("finalFile.dat");
        PrintStream finalFile = new PrintStream(file);
        for (int i = 0; i < 10; i++) {
            TopScorer p = this.topPlayers.get(i);
            finalFile.print(p.getScore() + ":" + p.getName() + "\n");
        }
        finalFile.close();
        oldFile.delete();
        file.renameTo(oldFile);
    }

}