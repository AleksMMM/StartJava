package lessons2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static int firstPlayer;
    static int secondPlayer;
    static int numberRandom;

    public void play(Player player1, Player player2) {
        Scanner s = new Scanner(System.in);
        numberRandom = (int)(Math.random()*100);
        System.out.println(numberRandom);

        System.out.println("Добро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в интревале от 1 до 100, кто первый угадал тот и выиграл. ");

        do {
            System.out.println(player1.getFirstName() + " введите число : ");
            firstPlayer = s.nextInt();
            System.out.println(player2.getFirstName() + " введите число : ");
            secondPlayer = s.nextInt();

            if(firstPlayer == numberRandom) {
                System.out.println("Поздравляем!!!Победил первый игрок!!! Это было число  - "+ numberRandom);
                break;
            }
            if(secondPlayer == numberRandom) {
                System.out.println("Поздравляем!!!Победил второй игрок!!! Это было число  - "+ numberRandom);
                break;
            } else {
                System.out.println("Пока никто не угадал :(  Попробуйте еще.\n");
                System.out.println("Подсказка : ");
                if(firstPlayer < numberRandom) {
                    System.out.println("Число первого игрока меньше искомого");
                }
                if(firstPlayer > numberRandom) {
                    System.out.println("Число первого игрока больше искомого");
                }
                if (secondPlayer < numberRandom) {
                    System.out.println("Число второго игрока меньше искомого\n");
                }
                if (secondPlayer > numberRandom){
                    System.out.println("Число второго игрока больше искомого\n");
                }
            }
        } while (true);
    }
}
