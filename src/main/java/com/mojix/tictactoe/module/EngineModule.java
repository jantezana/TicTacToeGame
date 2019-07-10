package com.mojix.tictactoe.module;

import com.google.inject.AbstractModule;
import com.mojix.tictactoe.businesslogic.engine.GameEngine;
import com.mojix.tictactoe.businesslogic.engine.TicTacToeEngine;

/**
 * EngineModule class.
 *
 * @version 2019/07/10
 */
public class EngineModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GameEngine.class).to(TicTacToeEngine.class);
    }
}
