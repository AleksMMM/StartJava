package lessons2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player firstPlayer;
    Player secondPlayer;
    private int numberRandom;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public GuessNumber() {

    }

    Scanner s = new Scanner(System.in);

    public void play() {
        numberRandom = (int)(Math.random()*100);
        System.out.println(numberRandom);
        System.out.println("Добро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в интревале от 1 до 100, кто первый угадал тот и выиграл. ");

        do {
            System.out.println(firstPlayer.getFirstName() + " введите число : ");
            firstPlayer.setNumberPlayer(s.nextInt());

            if(firstPlayer.getNumberPlayer() == numberRandom) {
                System.out.println("Поздравляем!!!Победил первый игрок!!! Это было число  - "+ numberRandom);
                break;
            }
            if(secondPlayer.getNumberPlayer() == numberRandom) {
                System.out.println("Поздравляем!!!Победил второй игрок!!! Это было число  - "+ numberRandom);
                break;
            } else {
                System.out.println("не угадал :(  Попробуйте еще.\n");
                System.out.println("Подсказка : ");
                if(firstPlayer.getNumberPlayer() < numberRandom) {
                    System.out.println("Число первого игрока меньше искомого");
                    System.out.println(secondPlayer.getFirstName() + " введите число : ");
                    secondPlayer.setNumberPlayer(s.nextInt());

                }
                if(firstPlayer.getNumberPlayer() > numberRandom) {
                    System.out.println("Число первого игрока больше искомого");
                    System.out.println();
                    System.out.println(secondPlayer.getFirstName() + " введите число : ");
                    secondPlayer.setNumberPlayer(s.nextInt());
                    System.out.println();
                    System.out.println(secondPlayer.getFirstName() + " введите число : ");
                    secondPlayer.setNumberPlayer(s.nextInt());
                }
                if (secondPlayer.getNumberPlayer() < numberRandom) {
                    System.out.println("Число второго игрока меньше искомого\n");
                    System.out.println();
                    System.out.println(firstPlayer.getFirstName() + " введите число : ");
                    firstPlayer.setNumberPlayer(s.nextInt());

                }
                if (secondPlayer.getNumberPlayer() > numberRandom){
                    System.out.println("Число второго игрока больше искомого\n");
                    System.out.println();
                    System.out.println(secondPlayer.getFirstName() + " введите число : ");
                    firstPlayer.setNumberPlayer(s.nextInt());
                }
            }
        } while (true);
    }
}
