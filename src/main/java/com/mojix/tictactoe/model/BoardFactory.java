package com.mojix.tictactoe.model;

import com.google.common.base.Preconditions;

import static com.mojix.tictactoe.util.Constants.DEFAULT_SIZE;

/**
 * BoardFactory class.
 *
 * @version 2019/06/09
 */
public class BoardFactory {

    /**
     * Creates the board.
     *
     * @param type the type
     * @return the board
     */
    public Board createBoard(final BoardType type) {
        Preconditions.checkNotNull(type, "The type is null");
        Board board;
        switch (type) {
            case TIC_TAC_TOE: {
                board = new TicTacToeBoard(DEFAULT_SIZE);
                break;
            }
            default: {
                board = null;
                break;
            }
        }

        return board;
    }
}
