package com.sposato.Calculator;

/**
 * Class: Calculator
 * Author: John Sposato
 * Purpose:
 *  Simple calculator to practice TDD/Java development
 */
public class Calculator {

    /**
     * add - Add two integers
     * @param x
     * @param y
     * @return
     */
    public int add(Integer x, Integer y) {
        return x + y;
    }

    /**
     * subtract - Subtract two integers
     * @param x
     * @param y
     * @return
     */
    public int subtract(Integer x, Integer y) {
        return x - y;
    }

    /**
     * multiply - Multiply two integers
     * @param x
     * @param y
     * @return
     */
    public int multiply(Integer x, Integer y) {
        return x * y;
    }

    /**
     * divide - Divide two integers
     * @param x
     * @param y
     * @return
     */
    public int divide(Integer x, Integer y) {
        return x/y;
    }
}
