package com.mojix.tictactoe.businesslogic.engine;

/**
 * Board position
 */
public interface Position {
    /**
     * Define a position
     * @param coordinates position coordinates
     */
    void setPosition(Integer... coordinates);
}
