package com.mojix.tictactoe.businesslogic.board;

import com.mojix.tictactoe.businesslogic.game.TicTacToeGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Objects;

/**
 * TicTacToeBoard class.
 *
 * @author jantezana
 * @version 2019/07/09
 */
public class TicTacToeBoard implements Board {

    private static final Logger logger = LoggerFactory.getLogger(TicTacToeGame.class);
    private Box<String>[][] boxes;
    private int size;

    /**
     * Builds an instance of TicTacToeBoard.
     *
     * @param size the size
     */
    public TicTacToeBoard(final int size) {
        this.size = size;
        boxes = new Box[size][size];
    }

    public void mark(String symbol, int row, int column) {
        boxes[row][column] = new Box<>(symbol);
    }

    @Override
    public void draw() {
        logger.info("Drawing the board");
        for (int row = 0; row < boxes.length; row++) {
            for (int column = 0; column < boxes[row].length; column++) {
                System.out.print(
                        String.format("%s ", boxes[row][column] != null ? boxes[row][column].getValue() : "_"));
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Check if there is a winner in the board
     *
     * @return true if there is a winner
     */
    public boolean checkForWinner() {
        boolean winner = checkRows();
        if (!winner) {
            winner = checkColumns();
            if (!winner) {
                winner = checkDiagonals();
            }
        }
        return winner;
    }

    /**
     * Check if the board is full
     * @return true if is full
     */
    public boolean checkForCompleted() {
        boolean isFull = true;
        for (Box<String>[] boxArray : boxes) {
            isFull = isFull && Arrays.stream(boxArray).noneMatch(Objects::isNull);
        }
        return isFull;
    }

    private boolean checkRows() {
        boolean winner = false;
        for (int row = 0; row < size && !winner; row++) {
            Box initRowBox = boxes[row][0];
            if (initRowBox != null) {
                winner = Arrays.stream(boxes[row]).noneMatch(stringBox ->
                        stringBox == null || !stringBox.getValue().equals(initRowBox.getValue()));
            }
        }
        return winner;
    }

    private boolean checkColumns() {
        boolean winner = false;
        for (int column = 0; column < size && !winner; column++) {
            Box initColumnBox = boxes[0][column];
            if (initColumnBox != null) {
                boolean winnerRow = true;
                for (int row = 0; row < size; row++) {
                    Box<String> box = boxes[row][column];
                    winnerRow = winnerRow && (box != null && box.getValue().equals(initColumnBox.getValue()));
                }
                winner = winnerRow;
            }
        }
        return winner;
    }

    private boolean checkDiagonals() {
        boolean winner = false;
        Box initLeftBox = boxes[0][0];
        if (initLeftBox != null) {
            for (int i = 0; i < size; i++) {
                Box<String> box = boxes[i][i];
                winner = (box != null && box.getValue().equals(initLeftBox.getValue()));
            }
        }

        if (!winner) {
            Box initRightBox = boxes[0][size - 1];
            if (initRightBox != null) {
                for (int i = size - 1; i >= 0; i--) {
                    Box<String> box = boxes[i][i];
                    winner = (box != null && box.getValue().equals(initRightBox.getValue()));
                }
            }
        }
        return winner;
    }
}
