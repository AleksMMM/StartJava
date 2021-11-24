package com.startjava.lesson_2_3.game;

import java.util.Arrays;
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

    public void startGame() {
        System.out.println("Y каждого игрока по 10 попыток");
        numberRandom = (int) (Math.random() * 101);
        System.out.println("it is big Secret,random number = " + numberRandom + "\n");
        firstPlayer.initNumbers();
        secondPlayer.initNumbers();
        do {
            if (makeMove(firstPlayer)) {
                break;
            }
            if (makeMove(secondPlayer)) {
                break;
            }
        } while (checkGameOver());
    }

    private boolean makeMove(Player player) {
        if (player.getAttempt() < 10) {
            inputNumber(player);
            if (compareNumbers(player.getNumbers(player.getAttempt() - 1))) {
                System.out.println("Player  " + player.getName() + " You guessed number "
                        + numberRandom + " from " + player.getAttempt() + " attempt");
                System.out.println("PlayerAnswer:");
                System.out.println(Arrays.toString(player.printPlayerAnswer(player.getAttempt())));
                return true;
            }
        } else {
            System.out.println("Player  " + player.getName() + " You lost(((");
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.println("Player  " + player.getName() + " please input number:");
        player.setNumber(console.nextInt());
    }

    private boolean compareNumbers(int inputNumber) {
        if (inputNumber > numberRandom) {
            System.out.println(inputNumber + ": the hidden number is bigger(>) !");
        } else if (inputNumber < numberRandom) {
            System.out.println(inputNumber + ": the hidden number is less(<) !");
        } else {
            return true;
        }
        return false;
    }

    private boolean checkGameOver() {
        if (firstPlayer.getAttempt() >= 10 && secondPlayer.getAttempt() >= 10) {
            System.out.println("Game over !!!  ");
            System.out.println(Arrays.toString(firstPlayer.printPlayerAnswer(10)));
            System.out.println("");
            System.out.println(Arrays.toString(secondPlayer.printPlayerAnswer(10)));
            System.out.println("");
            return false;
        }
        return true;
    }
}