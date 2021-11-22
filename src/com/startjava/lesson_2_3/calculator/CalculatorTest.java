package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesOrNo = "";

        do {
            System.out.println("Введите математическое выражение:");
            String mathSign = scanner.nextLine();
            String[] mathSimbol = mathSign.split(" ");
            scanner.nextLine();
            int firstNumber = Integer.parseInt(mathSimbol[0]);
            int secondNumber = Integer.parseInt(mathSimbol[2]);
            char simbolCalculate = mathSimbol[1].charAt(1);
            System.out.println(calculator.calculate(simbolCalculate, firstNumber, secondNumber));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            yesOrNo = scanner.nextLine();
            while (!yesOrNo.equals("no") || !yesOrNo.equals("yes")) {
                System.out.println("введите yes no");
                yesOrNo = scanner.nextLine();
            }
        } while(yesOrNo.equals("yes"));
    }
}
