package com.mojix.tictactoe.model;

/**
 * Box class.
 *
 * @param <T> the type
 * @version 2019/07/09
 */
public class Box<T> {

    private T value;

    /**
     * Builds an instance of Box
     *
     * @param value the value
     */
    public Box(T value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public T getValue() {
        return value;
    }
}
