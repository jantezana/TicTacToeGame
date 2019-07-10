package com.mojix.tictactoe.businesslogic.game;

import com.mojix.tictactoe.businesslogic.board.Board;
import com.mojix.tictactoe.businesslogic.board.BoardFactory;
import com.mojix.tictactoe.businesslogic.board.BoardType;
import com.mojix.tictactoe.businesslogic.player.Player;
import com.mojix.tictactoe.businesslogic.player.PlayerFactory;
import com.mojix.tictactoe.businesslogic.player.PlayerType;
import com.mojix.tictactoe.businesslogic.player.TicTacToePlayer;
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
    public static final String SYMBOL_PLAYER_1 = "X";
    public static final String SYMBOL_PLAYER_2 = "O";
    private Board board;
    private Collection<Player> players;

    @Override
    public void create(String player1Name, String player2Name) {
        logger.info("Creating the game");

        logger.info("Creating the players");
        PlayerFactory playerFactory = new PlayerFactory();
        TicTacToePlayer player1 = (TicTacToePlayer) playerFactory.createPlayer(PlayerType.TIC_TAC_TOE, player1Name);
        player1.setSymbol(SYMBOL_PLAYER_1);

        TicTacToePlayer player2 = (TicTacToePlayer) playerFactory.createPlayer(PlayerType.TIC_TAC_TOE, player2Name);
        player2.setSymbol(SYMBOL_PLAYER_2);

        this.players = new LinkedList<>();
        this.players.add(player1);
        this.players.add(player2);

        this.players.stream().forEach(player -> System.out.println(player.getInfo()));

        BoardFactory boardFactory = new BoardFactory();
        this.board = boardFactory.createBoard(BoardType.TIC_TAC_TOE);
        this.board.draw();


    }
}
