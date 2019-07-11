package com.mojix.tictactoe;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mojix.tictactoe.businesslogic.engine.GameEngine;
import com.mojix.tictactoe.businesslogic.game.Game;
import com.mojix.tictactoe.businesslogic.game.TicTacToeGame;
import com.mojix.tictactoe.module.EngineModule;
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
        Injector injector = Guice.createInjector(new EngineModule());
        GameEngine engine = injector.getInstance(GameEngine.class);

        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println();
        System.out.println("ooooooooooooo  o8o               ooooooooooooo                        ooooooooooooo");
        System.out.println("8'   888   `8  `''               8'   888   `8                        8'   888   `8");
        System.out.println("     888      oooo   .ooooo.          888       .oooo.    .ooooo.          888       .ooooo.   .ooooo. ");
        System.out.println("     888      `888  d88' `'Y8         888      `P  )88b  d88' `'Y8         888      d88' `88b d88' `88b");
        System.out.println("     888       888  888               888       .oP'888  888               888      888   888 888ooo888");
        System.out.println("     888       888  888   .o8         888      d8(  888  888   .o8         888      888   888 888    .o");
        System.out.println("    o888o     o888o `Y8bod8P'        o888o     `Y888''8o `Y8bod8P'        o888o     `Y8bod8P' `Y8bod8P'");
        System.out.println();
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

        Game game = new TicTacToeGame();
        game.create("Player1", "Player2");

        logger.info("Starting the game");
        engine.checkWinner(((TicTacToeGame) game).getBoard());
    }
}
