package com.mojix.tictactoe.businesslogic.game;

/**
 * Game interface.
 *
 * @version 2019/07/09
 */
public interface Game {

    /**
     * Creates the game.
     * @param player1Name Player 1 name
     * @param player2Name Player 2 name
     */
    void create(String player1Name, String player2Name);
}
