package lessons2;

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
            char numberOperation = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            int secondNumber =  scanner.nextInt();
            scanner.nextLine();
            System.out.println(calculator.calculate(numberOperation, firstNumber, secondNumber));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            yesOrNo = scanner.nextLine();
            boolean yesNoCheck = true;
            while (yesNoCheck) {
                if (yesOrNo.equals("no") || yesOrNo.equals("yes")) {
                    yesNoCheck = false;
                } else {
                    System.out.println("введите yes no");
                    yesOrNo = scanner.nextLine();
                }
            }
        } while(yesOrNo.equals("yes"));
    }
}
