package com.mojix.tictactoe.model;

/**
 * PlayerFactory class.
 *
 * @version 2019/07/09
 */
public class PlayerFactory {

    /**
     * Creates the player
     *
     * @param type the type
     * @return the player
     */
    public Player createPlayer(final PlayerType type) {
        Player player;
        switch (type) {
            case TIC_TAC_TOE: {
                player = new TicTacToePlayer();
                break;
            }
            default: {
                player = null;
                break;
            }
        }

        return player;
    }
}
