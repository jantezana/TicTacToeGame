package com.mojix.tictactoe.model;

/**
 * Board class.
 *
 * @version 2019/07/09
 */
public class Board {

    private int size;

    /**
     * Builds an instance of board.
     *
     * @param size the size
     */
    public Board(final int size) {
        this.size = size;
    }

    /**
     * Gets the size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }
}
