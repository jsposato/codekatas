package com.sposato;

import com.sposato.Calculator.Calculator;

public class App {

    public static void main(String[] args) {

        Integer additionResult = null;
        Integer subtractionResult = null;
        Integer mulitplicationResult = null;
        Integer divisionResult = null;

        // Addition
        Calculator calc = new Calculator();
        additionResult = calc.add(4,4);
        String outString = "4 + 4 = ";
        System.out.println(outString.concat(additionResult.toString()));

        // Division
        divisionResult = calc.divide(4, 0);
        outString = "4 / 0 = ";
        System.out.println(outString.concat(divisionResult.toString()));
    }
}
