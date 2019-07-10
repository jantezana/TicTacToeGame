package com.mojix.tictactoe.businesslogic.player;

/**
 * Player interface.
 *
 * @version 2019/07/09
 */
public interface Player {

    /**
     * Gets the info.
     *
     * @return the info
     */
    String getInfo();

    String getName();

    void setName(String name);
}
