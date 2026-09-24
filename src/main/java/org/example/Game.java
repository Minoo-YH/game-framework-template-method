package org.example;

//void : not return anyting
//final : method can not be overrid or change by subclass
// initialaizGame: start and preper the game for given number

//% numberOfPlayers: move return to the next player and start again from player 0
// displayWinner();: show the winer after the game end.

public abstract class Game {

    public final void play(int numberOfPlayers) {
        initializeGame(numberOfPlayers);

        int playerInTurn = 0;

        while (!endOfGame()) {
            playSingleTurn(playerInTurn);
            playerInTurn = ++playerInTurn % numberOfPlayers;
        }

        displayWinner();
    }

    public abstract void initializeGame(int numberOfPlayers);

    public abstract boolean endOfGame();

    public abstract void playSingleTurn(int player);

    public abstract void displayWinner();
}