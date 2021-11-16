package lessons2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int numberRandom;
    Scanner s = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        numberRandom = (int) (Math.random() * 100);
        System.out.println(numberRandom);
        System.out.println("Добро пожаловать в игру \"Угадай число\".");
        System.out.println("Играют два игрока.");
        System.out.println("Нужно вводить число в интревале от 1 до 100, кто первый угадал тот и выиграл. ");

        do {
            System.out.println(firstPlayer.getFirstName() + " введите число : ");
            firstPlayer.setNumber(s.nextInt());

            if (firstPlayer.getNumber() < numberRandom) {
                System.out.println("Число первого игрока меньше искомого");
                System.out.println(secondPlayer.getFirstName() + " введите число : ");
                secondPlayer.setNumber(s.nextInt());

            } else if (firstPlayer.getNumber() > numberRandom) {
                System.out.println("Число первого игрока больше искомого");
                System.out.println();
                System.out.println(secondPlayer.getFirstName() + " введите число : ");
                secondPlayer.setNumber(s.nextInt());
            } else if(firstPlayer.getNumber() == numberRandom) {
                System.out.println("Поздравляем!!!Победил первый игрок!!! Это было число  - " + numberRandom);
                break;
            }

            System.out.println(secondPlayer.getFirstName() + " введите число : ");
            secondPlayer.setNumber(s.nextInt());
            if (secondPlayer.getNumber() < numberRandom) {
                System.out.println("Число второго игрока меньше искомого\n");
                System.out.println();
                System.out.println(firstPlayer.getFirstName() + " введите число : ");
                firstPlayer.setNumber(s.nextInt());

            }
            if (secondPlayer.getNumber() > numberRandom){
                System.out.println("Число второго игрока больше искомого\n");
                System.out.println();
                System.out.println(secondPlayer.getFirstName() + " введите число : ");
                firstPlayer.setNumber(s.nextInt());
            }

            if(secondPlayer.getNumber() == numberRandom) {
                System.out.println("Поздравляем!!!Победил второй игрок!!! Это было число  - " + numberRandom);
                break;
            }  else {
                System.out.println("не угадал :(  Попробуйте еще.\n");
            }

            } while (true);
    }
}
