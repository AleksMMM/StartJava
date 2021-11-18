package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String yesOrNo = "";

        do {
            System.out.println("Введите первое число:");
            int firstNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак математической операции:");
            char mathSign = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            int secondNumber =  scanner.nextInt();
            scanner.nextLine();
            System.out.println(calculator.calculate(mathSign, firstNumber, secondNumber));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            yesOrNo = scanner.nextLine();
            while (!yesOrNo.equals("no") || !yesOrNo.equals("yes")) {
                System.out.println("введите yes no");
                yesOrNo = scanner.nextLine();
            }
        } while(yesOrNo.equals("yes"));
    }
}
