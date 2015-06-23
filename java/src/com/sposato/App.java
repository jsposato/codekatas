package com.sposato;

import com.sposato.Calculator.Calculator;

public class App {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Integer result = calc.add(4,4);
        String outString = "4 + 4 = ";
        System.out.println(outString.concat(result.toString()));
    }
}
