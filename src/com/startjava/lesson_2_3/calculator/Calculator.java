package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public Number calculate(char mathSign, int firstNumber, int secondNumber) {
        switch (mathSign) {
            case '+' :
                return plus(firstNumber, secondNumber);
            case '/' :
                return division(firstNumber, secondNumber);
            case '*' :
                return multiplication(firstNumber, secondNumber);
            case '-' :
                return subtraction(firstNumber, secondNumber);
            case '^' :
                return exponentiation(firstNumber, secondNumber);
            case '%' :
                return remainderDivision(firstNumber, secondNumber);
            }
            return null;
    }

    private int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private double division(int firstNumber, int secondNumber) {
        return Math.floorDiv(firstNumber, secondNumber) ;
    }

    private static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private double exponentiation(int firstNumber, int step) {
       return Math.pow(firstNumber, step);

    }

    private int remainderDivision(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
