package com.mojix.tictactoe.businesslogic.engine;

import com.mojix.tictactoe.businesslogic.board.Board;
import com.mojix.tictactoe.businesslogic.board.TicTacToeBoard;
import com.mojix.tictactoe.businesslogic.player.Player;
import com.mojix.tictactoe.businesslogic.player.TicTacToePlayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TicTacToeGameEngine implements GameEngine {
    private static final Logger logger = LoggerFactory.getLogger(TicTacToeGameEngine.class);
    @Override
    public void play(Player player, Board board, Position position) {
        String symbol = ((TicTacToePlayer) player).getSymbol();
        TicTacToeBoard ticTacToeBoard = (TicTacToeBoard) board;
        TicTacToePosition ticTacToePosition = (TicTacToePosition) position;
        ticTacToeBoard.mark(symbol, ticTacToePosition.getX(), ticTacToePosition.getY());
        ticTacToeBoard.draw();
    }

    @Override
    public boolean checkWinner(Board board) {
        TicTacToeBoard ticTacToeBoard= (TicTacToeBoard) board;
        boolean winner=ticTacToeBoard.checkForWinner();
        System.out.println(String.format("There is a winner?: %s",winner));
        return winner;
    }

    @Override
    public boolean gameOver(Board board) {
        TicTacToeBoard ticTacToeBoard= (TicTacToeBoard) board;
        boolean boardCompleted=ticTacToeBoard.checkForCompleted();
        System.out.println(String.format("Game over?: %s",boardCompleted));
        return boardCompleted;
    }
}
