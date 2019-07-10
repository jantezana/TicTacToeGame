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
public class TicTacToeGame implements Game {

    private static final Logger logger = LoggerFactory.getLogger(TicTacToeGame.class);
    private Board board;
    private Collection<Player> players;

    @Override
    public void create() {
        logger.info("Creating the game");

        logger.info("Creating the players");
        PlayerFactory playerFactory = new PlayerFactory();
        TicTacToePlayer player1 = (TicTacToePlayer) playerFactory.createPlayer(PlayerType.TIC_TAC_TOE);
        player1.setName("player1");

        TicTacToePlayer player2 = (TicTacToePlayer) playerFactory.createPlayer(PlayerType.TIC_TAC_TOE);
        player2.setName("player2");

        this.players = new LinkedList<>();
        this.players.add(player1);
        this.players.add(player2);

        this.players.stream().forEach(player -> System.out.println(player.getInfo()));

        BoardFactory boardFactory = new BoardFactory();
        this.board = boardFactory.createBoard(BoardType.TIC_TAC_TOE);
        this.board.draw();


    }
}
