package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int numberRandom;
    Scanner console = new Scanner(System.in);

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
        System.out.println("у каждого игрока по 10 попыток");

        do {
            System.out.println(firstPlayer.getName() + " введите число : ");
            firstPlayer.setNumber(console.nextInt());
            firstPlayer.setNumberArray(firstPlayer.getNumber());
            secondPlayer.setChansPlayer(firstPlayer.getChansPlayer() + 1);

            if (firstPlayer.getNumber() < numberRandom) {
                System.out.println("Число первого игрока меньше искомого");
                System.out.println(secondPlayer.getName() + " введите число : ");
                secondPlayer.setNumber(console.nextInt());
                secondPlayer.setNumberArray(secondPlayer.getNumber());
                secondPlayer.setChansPlayer(secondPlayer.getChansPlayer() + 1);

            } else if (firstPlayer.getNumber() > numberRandom) {
                System.out.println("Число первого игрока больше искомого");
                System.out.println();
                System.out.println(secondPlayer.getName() + " введите число : ");
                secondPlayer.setNumber(console.nextInt());
                secondPlayer.setNumberArray(secondPlayer.getNumber());
                secondPlayer.setChansPlayer(secondPlayer.getChansPlayer() + 1);
            } else if (firstPlayer.getNumber() == numberRandom) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + numberRandom + " с " + firstPlayer.getChansPlayer() + " попытки");
                secondPlayer.arraysNew(secondPlayer);
                firstPlayer.arraysNew(firstPlayer);
                break;
            } else if (firstPlayer.getChansPlayer() == 9) {
                System.out.println("У " + firstPlayer.getName() + " закончились попытки");
                System.out.println("не угадал :(  Попробуйте еще.\n");
                secondPlayer.arraysNew(secondPlayer);
                firstPlayer.arraysNew(firstPlayer);
            }

            if (secondPlayer.getNumber() < numberRandom) {
                System.out.println("Число второго игрока меньше искомого\n");

            } else if (secondPlayer.getNumber() > numberRandom) {
                System.out.println("Число второго игрока больше искомого\n");

            }

            if (secondPlayer.getNumber() == numberRandom) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + numberRandom + " с " + secondPlayer.getChansPlayer() + " попытки");
                secondPlayer.arraysNew(secondPlayer);
                firstPlayer.arraysNew(firstPlayer);
                break;
            } else if (secondPlayer.getChansPlayer() == 9) {
                System.out.println("У " + secondPlayer.getName() + " закончились попытки");
                System.out.println("не угадал :(  Попробуйте еще.\n");
                secondPlayer.arraysNew(secondPlayer);
                firstPlayer.arraysNew(firstPlayer);
            }

        } while (true);
    }


}

