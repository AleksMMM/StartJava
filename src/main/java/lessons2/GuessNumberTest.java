package lessons2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("введите имена игроков");
        Player player1 = new Player(new Scanner(System.in).nextLine());
        Player player2 = new Player(new Scanner(System.in).nextLine());
        NumberGuess numberGuess = new NumberGuess();
        numberGuess.games(player1, player2);
        continueGame(player1, player2);

    }

    public static void continueGame(Player player1, Player player2) {
        String answer = "";
        do {
        System.out.println("Хотите продолжить игру? [yes/no]:");
        answer = new Scanner(System.in).nextLine();
            if (answer.equals("yes")) {
                new NumberGuess().games(player1,player2);
            }else if (answer.equals("no")) {
                break;
            }
        } while(!answer.equals("yes") || !answer.equals("no"));

    }

}

