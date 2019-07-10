package com.mojix.tictactoe.businesslogic.engine;

import com.mojix.tictactoe.businesslogic.board.Board;
import com.mojix.tictactoe.businesslogic.board.TicTacToeBoard;
import com.mojix.tictactoe.businesslogic.player.Player;
import com.mojix.tictactoe.businesslogic.player.TicTacToePlayer;

public class TicTacToeGameEngine implements GameEngine {

    @Override
    public void play(Player player, Board board, Position position) {
        String symbol = ((TicTacToePlayer) player).getSymbol();
        TicTacToeBoard ticTacToeBoard = (TicTacToeBoard) board;
        TicTacToePosition ticTacToePosition = (TicTacToePosition) position;
        ticTacToeBoard.mark(symbol, ticTacToePosition.getX(), ticTacToePosition.getY());
        ticTacToeBoard.draw();
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
