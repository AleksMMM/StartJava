package lessons2;

import java.util.Scanner;

public class GuessNumberTest {
    Player firstPlayer;
    Player secondPlayer;
    static Scanner scanner = new Scanner(System.in);
    static GuessNumber numberGuess = new GuessNumber();
    static String namePlayerFirst;
    static String namePlayerSecond;

    public GuessNumberTest(String namePlayerFirst, String namePlayerSecond) {
        firstPlayer = new Player(namePlayerFirst);
        this.secondPlayer = new Player(namePlayerSecond);
    }

    public static void main(String[] args) {
        System.out.println("введите имена игроков");
        namePlayerFirst = scanner.nextLine();
        namePlayerSecond = scanner.nextLine();
        GuessNumberTest guessNumberTest = new GuessNumberTest(namePlayerFirst, namePlayerSecond);
        numberGuess.play(guessNumberTest.firstPlayer, guessNumberTest.secondPlayer);
        continueGame(guessNumberTest.firstPlayer, guessNumberTest.secondPlayer);

    }

    public static void continueGame(Player player1, Player player2) {
        String answer = "";
        do {
        System.out.println("Хотите продолжить игру? [yes/no]:");
        answer = new Scanner(System.in).nextLine();
            if (answer.equals("yes")) {
                numberGuess.play(player1,player2);
            } else if (answer.equals("no")) {
                break;
            }
        } while (!answer.equals("yes") || !answer.equals("no"));

    }

}

