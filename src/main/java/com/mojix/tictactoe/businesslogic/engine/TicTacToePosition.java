package com.mojix.tictactoe.businesslogic.engine;

/**
 * Position in the TicTacToe board
 */
public class TicTacToePosition implements Position{
    private int x;
    private int y;

    /**
     * Create a TicTacToe board position
     * @param coordinates the coordinates
     */
    public TicTacToePosition(Integer... coordinates) {
        setPosition(coordinates);
    }

    @Override
    public void setPosition(Integer... coordinates) {
        x=coordinates[0];
        y=coordinates[1];
    }

    /**
     * Get X coordinate
     * @return X coordinate
     */
    public int getX(){
        return x;
    }

    /**
     * Get Y coordinate
     * @return Y coordinate
     */
    public int getY(){
        return y;
    }
}
