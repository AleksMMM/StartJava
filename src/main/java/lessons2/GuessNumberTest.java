package lessons2;

import java.util.Scanner;

public class GuessNumberTest {
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

