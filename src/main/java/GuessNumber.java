import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {

    public static void main(String[] args) {
        int unknownNumber, userNumber, trysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
        unknownNumber = (int) Math.floor(Math.random() * 100);
        do {
            trysCount++;
            System.out.print("Введите ваше число: ");
            userNumber = input.nextInt();
            if (userNumber > unknownNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (userNumber < unknownNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }

            } while (userNumber != unknownNumber);

            System.out.println("Поздравляю, число угадано!");
            System.out.println("Количество попыток: " + trysCount);
        }
    }

