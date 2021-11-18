package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите имена игроков");
        Player playerFirst = new Player(scanner.nextLine());
        Player playerSecond = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerFirst, playerSecond);
        guessNumber.play();
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                guessNumber.play();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}