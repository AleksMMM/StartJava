package lessons2;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String str = "";





        do {
            System.out.println("Введите первое число:");
            int one = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак математической операции:");
            char ch = scanner.next().charAt(0);
            System.out.println("Введите второе число:");
            int two =  scanner.nextInt();
            scanner.nextLine();
            System.out.println(calculator.swithMethod(ch, one, two));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            str = scanner.nextLine();
            boolean bool = true;
            while (bool) {
                if ( str.equals("no") | str.equals("yes")) {
                    bool = false;

                }else {
                    System.out.println("введите yes no");
                    str = scanner.nextLine();

                }
            }



        }while (str.equals("yes"));
    }
}
