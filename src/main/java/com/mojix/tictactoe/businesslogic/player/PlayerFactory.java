package com.mojix.tictactoe.businesslogic.player;

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
     * @param name the player name
     * @return the player
     */
    public Player createPlayer(final PlayerType type, final String name) {
        Player player;
        switch (type) {
            case TIC_TAC_TOE: {
                player = new TicTacToePlayer(name);
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
