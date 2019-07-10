package com.mojix.tictactoe.model;

/**
 * Player class.
 *
 * @version 2019/07/09
 */
public class Player {

    private String name;

    /**
     * Builds an instance of Player.
     *
     * @param name the name
     */
    public Player(final String name) {
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
}
