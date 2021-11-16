package lessons2;

import java.util.Scanner;

public class GuessNumberTest {
    Player firstPlayer;
    Player secondPlayer;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите имена игроков");
        Player playerFirst = new Player(scanner.nextLine());
        Player playerSecond = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(playerFirst, playerSecond);
        guessNumber.play();
        String answer = "";
        do {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                guessNumber.play();
            }
        } while (!answer.equals("no"));

    }


    }

    public static void continueGame(Player player1, Player player2) {
        String answer = "";
        do {
        System.out.println("Хотите продолжить игру? [yes/no]:");
        answer = new Scanner(System.in).nextLine();
            if (answer.equals("yes")) {
                guessNumber.play();
            } else if (answer.equals("no")) {
                break;
            }
        } while (!answer.equals("yes") || !answer.equals("no"));

    }

}

