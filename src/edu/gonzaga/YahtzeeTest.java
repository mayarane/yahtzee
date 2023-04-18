/* Author: Maya Tiu
 * Class: CPSC 224 01
 * Date: 03/26/23
 * Description: This file is a class for the Unit Tests I created in the game Yahtzee
 */

package edu.gonzaga;

import org.junit.Test;
import static org.junit.Assert.*;

public class YahtzeeTest {
    //3 tests for LowerScoreCard
    @Test
    public void testYahtzeeScore() {
        Yahtzee game = new Yahtzee();
        int[] dice = {1, 1, 1, 1, 1};
        Object Yahtzee = null;
        int expectedScore = game.calculateScore(dice, null);
        int actualScore = 0;
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testFullHouseScore() {
        Yahtzee game = new Yahtzee();
        int[] dice = {1, 1, 2, 2, 2};
        int expectedScore = 25;
        Object FullHouse = null;
        int actualScore = game.calculateScore(dice, null);
        assertEquals(expectedScore, actualScore);
    }

    @Test
    public void testChanceScore() {
        Yahtzee game = new Yahtzee();
        int[] dice = {1, 2, 3, 4, 5};
        int expectedScore = 15;
        Object Chance = null;
        int actualScore = game.calculateScore(dice, null);
        assertEquals(expectedScore, actualScore);
    }

    //3 tests for Player
    @Test
    public void testSavePlayerName() {
        Player player = new Player();
        player.savePlayerName("Crandall");
        String name = player.getPlayerName();
        assertEquals("Crandall", name);
    }

    @Test
    public void testLoadPlayerName() {
        Player player = new Player();
        player.savePlayerName("Maya");
        player = new Player();
        String name = player.getPlayerName();
        assertEquals("Maya", name);
    }

    @Test
    public void testDefaultName() {
        Player player = new Player();
        String name = player.getPlayerName();
        assertEquals("Player 1", name);
    }

    //3 tests for HandOfDice

    @Test
    public void testSaveHandOfDice() {
        HandOfDice handofDice = new HandOfDice();
        int[] dice = {1, 2, 3, 4, 5};
        handofDice.saveHandOfDice(dice);
        int[] savedDice = handofDice.getHandOfDice;
        assertArrayEquals(dice, savedDice);
    }

    @Test
    public void testLoadHandOfDice() {
        HandOfDice handOfDice = new HandOfDice();
        int[] dice = {2, 2, 2, 2, 2};
        handOfDice.saveHandOfDice(dice);
        handOfDice = new HandOfDice();
        int[] savedDice = handOfDice.getHandOfDice();
        assertArrayEquals(dice, savedDice);
    }

    @Test
    public void testDefaultHandOfDice() {
        HandOfDice handOfDice = new HandOfDice();
        int[] dice = handOfDice.getHandOfDice();
        assertNotNull(dice);
        assertEquals(5, dice.length);
        for (int i = 0; i < 5; i++) {
            assertTrue(dice[i] >= 1 && dice[i] <= 6);
        }
    }

    //3 tests for UpperScoreCard
//    @Test
//    public void testGetScore() {
//        UpperScoreCard upperScoreCard = new UpperScoreCard();
//        Object Category = null;
//        CurrentScoreCard scoreCard = null;
//        scoreCard.setScore(Category.ONES, 3);
//        scoreCard.setScore(Category.TWOS, 6);
//        scoreCard.setScore(Category.THREES, 9);
//        scoreCard.setScore(Category.FOURS, 12);
//        scoreCard.setScore(Category.FIVES, 15);
//        scoreCard.setScore(Category.SIXES, 18);
//        assertEquals(63, scoreCard.getScore());
//    }
//
//    @Test
//    public void testGetBonusScore() {
//        UpperScoreCard scoreCard = new UpperScoreCard();
//        Object Category = null;
//        scoreCard.upScoreCard(Category.ONES, 3);
//        scoreCard.upScoreCard(Category.TWOS, 6);
//        scoreCard.upScoreCard(Category.THREES, 9);
//        scoreCard.upScoreCard(Category.FOURS, 12);
//        scoreCard.upScoreCard(Category.FIVES, 15);
//        scoreCard.upScoreCard(Category.SIXES, 18);
//        assertEquals(35, scoreCard.getBonusScore());
//    }
//
//    @Test
//    public void testIsFull() {
//        UpperScoreCard scoreCard = new UpperScoreCard();
//        assertFalse(scoreCard.isFull());
//        Object Category = null;
//        scoreCard.getScore(Category.ONES, 3);
//        scoreCard.getScore(Category.TWOS, 6);
//        scoreCard.getScore(Category.THREES, 9);
//        scoreCard.getScore(Category.FOURS, 12);
//        scoreCard.getScore(Category.FIVES, 15);
//        assertFalse(scoreCard.isFull());
//        scoreCard.getScore(Category.SIXES, 18);
//        assertTrue(scoreCard.isFull());
//    }
//
//    //3 tests for CurrentScoreCard
//    @Test
//    public void testGetTotalScore() {
//        CurrentScoreCard scoreCard = new CurrentScoreCard();
//        scoreCard.getScore(Category.ONES, new int[]{1, 1, 1, 1, 1});
//        scoreCard.getScore(Category.TWOS, new int[]{2, 2, 2, 2, 2});
//        scoreCard.getScore(Category.THREES, new int[]{3, 3, 3, 3, 3});
//        scoreCard.getScore(Category.FOURS, new int[]{4, 4, 4, 4, 4});
//        scoreCard.getScore(Category.FIVES, new int[]{5, 5, 5, 5, 5});
//        scoreCard.getScore(Category.SIXES, new int[]{6, 6, 6, 6, 6});
//        scoreCard.getScore(Category.THREE_OF_A_KIND, new int[]{1, 1, 1, 4, 4});
//        scoreCard.getScore(Category.FOUR_OF_A_KIND, new int[]{2, 2, 2, 2, 4});
//        scoreCard.getScore(Category.FULL_HOUSE, new int[]{3, 3, 3, 4, 4});
//        scoreCard.getScore(Category.SMALL_STRAIGHT, new int[]{1, 2, 3, 4, 5});
//        scoreCard.getScore(Category.LARGE_STRAIGHT, new int[]{2, 3, 4, 5, 6});
//        scoreCard.getScore(Category.YAHTZEE, new int[]{1, 1, 1, 1, 1});
//        scoreCard.getScore(Category.CHANCE, new int[]{1, 2, 3, 4, 5});
//        assertEquals(109, scoreCard.getTotalScore());
//    }
//
//    @Test
//    public void testGetUpperScore() {
//        CurrentScoreCard scoreCard = new CurrentScoreCard();
//        scoreCard.getScore(Category.ONES, new int[]{1, 1, 1, 1, 1});
//        scoreCard.getScore(Category.TWOS, new int[]{2, 2, 2, 2, 2});
//        scoreCard.getScore(Category.THREES, new int[]{3, 3, 3, 3, 3});
//        scoreCard.getScore(Category.FOURS, new int[]{4, 4, 4, 4, 4});
//        scoreCard.getScore(Category.FIVES, new int[]{5, 5, 5, 5, 5});
//        scoreCard.getScore(Category.SIXES, new int[]{6, 6, 6, 6, 6});
//        assertEquals(21, scoreCard.getUpperScore());
//    }
//
//    @Test
//    public void testGetLowerScore() {
//        CurrentScoreCard scoreCard = new CurrentScoreCard();
//        scoreCard.getScore(Category.ONES, new int[]{1, 1, 1, 1, 1});
//        scoreCard.getScore(Category.TWOS, new int[]{2, 2, 2, 2, 2});
//        scoreCard.getScore(Category.THREES, new int[]{3, 3, 3, 3, 3});
//    }
}