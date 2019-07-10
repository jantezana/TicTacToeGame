package com.mojix.tictactoe.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.LinkedList;

/**
 * TicTacToeGame class.
 *
 * @version 2019/07/09
 */
public class TicTacToeGame {

    private static final Logger logger = LoggerFactory.getLogger(TicTacToeGame.class);
    private Board board;
    private Collection<Player> players;

    /**
     * Builds an instance of TicTacToeGame.
     */
    private TicTacToeGame(Board board, Collection<Player> players) {
        this.board = board;
        this.players = players;
    }

    /**
     * Start the game.
     */
    public void start() {
        logger.info("Starting the game");
    }

    public static class Builder {

        private Board board;
        private Collection<Player> players;

        /**
         * Builds a instance of Builder.
         */
        public Builder() {
            this.board = new Board(3);
            this.players = new LinkedList<>();

            this.InitializePlayers();
        }

        /**
         * initialize fake players.
         */
        private void InitializePlayers() {
            Player player1 = new Player("player1");
            Player player2 = new Player("player2");

            this.players.add(player1);
            this.players.add(player2);
        }

        /**
         * Sets the board.
         *
         * @param board the new board
         * @return the builder
         */
        public Builder setBoard(final Board board) {
            this.board = board;
            return this;
        }

        /**
         * Sets the list of players
         *
         * @param players the list of players
         * @return the builder
         */
        public Builder setPlayers(final Collection<Player> players) {
            this.players = players;
            return this;
        }

        /**
         * Builds the game;
         *
         * @return the TicTacToeGame
         */
        public TicTacToeGame build() {
            return new TicTacToeGame(board, players);
        }
    }
}
