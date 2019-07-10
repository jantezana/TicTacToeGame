package com.mojix.tictactoe.businesslogic.player;

import com.google.common.base.Preconditions;

/**
 * TicTacToePlayer class.
 *
 * @version 2019/07/09
 */
public class TicTacToePlayer implements Player {

    private String name;
    private String symbol;
    /**
     * Builds an instance of TicTacToePlayer.
     */
    public TicTacToePlayer() {
    }

    /**
     * Builds an instance of TicTacToePlayer.
     *
     * @param name the name
     */
    public TicTacToePlayer(final String name) {
        Preconditions.checkNotNull(name, "The name is null");
        this.name = name;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    @Override
    public void setName(final String name) {
        Preconditions.checkNotNull(name, "The name is null");
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s", this.name);
    }

    /**
     * The player symbol
     * @return a character
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * The player symbol
     * @param symbol a character
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
