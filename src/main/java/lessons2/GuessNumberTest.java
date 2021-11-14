package lessons2;

import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите имена игроков");
        Player firstPlayer = new Player(scanner.nextLine());
        Player secondPlayer = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
        guessNumber.play(firstPlayer, secondPlayer);
        continueGame(firstPlayer, secondPlayer);

    }

    public static void continueGame(Player player1, Player player2) {
        String answer = "";
        do {
        System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = new Scanner(System.in).nextLine();
            if (answer.equals("yes")) {
              new GuessNumber().play(player1, player2);
            } else if (answer.equals("no")) {
                break;
            }
        } while (!answer.equals("yes") || !answer.equals("no"));
    }
}