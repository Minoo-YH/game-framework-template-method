package org.example;
// extends means that DiceGame inherits from Game
//scores stores the scores of all players.


import java.util.Random;

public class DiceGame extends Game {

    private int[] scores;
    private int winningPlayer = -1;
    private final int winningScore = 20;

    private final Random random = new Random();

    @Override
    public void initializeGame(int numberOfPlayers) {
        scores = new int[numberOfPlayers];
        winningPlayer = -1;

        System.out.println("Dice Game started!");
        System.out.println("First player to reach "
                + winningScore + " points wins.");
        System.out.println();
    }

    @Override
    public boolean endOfGame() {
        return winningPlayer != -1;
    }

    @Override
    public void playSingleTurn(int player) {

        int dice = random.nextInt(6) + 1;

        scores[player] = scores[player] + dice;

        System.out.println(
                "Player " + (player + 1)
                        + " rolled " + dice
                        + " | Score: " + scores[player]
        );

        if (scores[player] >= winningScore) {
            winningPlayer = player;
        }
    }

    @Override
    public void displayWinner() {
        System.out.println();
        System.out.println(
                "Player " + (winningPlayer + 1) + " wins!"
        );
    }
}
