package com.mojix.tictactoe.businesslogic.engine;

import com.mojix.tictactoe.businesslogic.board.Board;
import com.mojix.tictactoe.businesslogic.player.Player;

/**
 * Game engine interface
 */
public interface GameEngine {
    /**
     * A movement in the game
     * @param player Player
     * @param board Board
     * @param position Position of the movement
     */
    void play(Player player, Board board, Position position);

    /**
     * If there is a winner
     * @return True if there is a winner
     */
    boolean checkWinner();

    /**
     * If the game is over
     * @return true if the game is over
     */
    boolean gameOver();
}
