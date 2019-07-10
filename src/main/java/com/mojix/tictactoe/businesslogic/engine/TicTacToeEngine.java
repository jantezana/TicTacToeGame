package com.mojix.tictactoe.businesslogic.engine;

import com.mojix.tictactoe.businesslogic.board.Board;
import com.mojix.tictactoe.businesslogic.player.Player;

/**
 * TicTacToeEngine class.
 *
 * @version 2019/07/10
 */
public class TicTacToeEngine implements GameEngine {

    @Override
    public void play(Player player, Board board, Position position) {

    }

    @Override
    public boolean checkWinner() {
        return false;
    }

    @Override
    public boolean gameOver() {
        return false;
    }
}
