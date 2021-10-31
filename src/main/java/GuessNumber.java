import java.util.Scanner;
import java.lang.Math;

public class GuessNumber {

    public static void main(String[] args) {
        int UnknownNumber, UserNumber, TrysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
        UnknownNumber = (int)Math.floor(Math.random() * 100);
        do {
            TrysCount++;
            System.out.print("Введите ваше число: ");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if (UserNumber < UnknownNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                    System.out.println("Поздравляю, число угадано!");
                }
            } while (UserNumber != UnknownNumber);
            System.out.println("Количество попыток: " + TrysCount);
        }
    }

