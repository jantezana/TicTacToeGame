package com.mojix.tictactoe;

import com.mojix.tictactoe.businesslogic.game.Game;
import com.mojix.tictactoe.businesslogic.game.TicTacToeGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class.
 *
 * @version 2019/07/09
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * Main method
     *
     * @param args the arguments
     */
    public static void main(String args[]) {
        logger.info("Tic Tac Toe game");
        Game game = new TicTacToeGame();
        game.create("Player1", "Player2");
    }
}
