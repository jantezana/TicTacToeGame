package com.mojix.tictactoe.businesslogic.board;

import com.mojix.tictactoe.businesslogic.game.TicTacToeGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    public void mark(String symbol, int row, int column){
        boxes[row][column]=new Box<>(symbol);
    }

    @Override
    public void draw() {
        logger.info("Drawing the board");
        for (int row = 0; row < boxes.length; row++) {
            for (int column = 0; column < boxes[row].length; column++) {
                System.out.print(String.format("%s ", boxes[row][column] != null ? boxes[row][column].getValue() : "_"));
            }
            System.out.println();
        }
        System.out.println();
    }
}
