package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Player1 , please input name:");
        Player player1 = new Player(scan.next());

        System.out.println("Player2 , please input name:");
        Player player2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);

        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            game.startGame();
            do {
                System.out.println("Continue ? [yes/no]:");
                playerAnswer = scan.next();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        }
    }
}