package com.mojix.tictactoe.model;

import com.google.common.base.Preconditions;

/**
 * TicTacToePlayer class.
 *
 * @version 2019/07/09
 */
public class TicTacToePlayer implements Player {

    private String name;

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
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(final String name) {
        Preconditions.checkNotNull(name, "The name is null");
        this.name = name;
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s", this.name);
    }
}
