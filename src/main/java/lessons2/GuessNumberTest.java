package lessons2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTest {
    static NumberGues numberGues = new NumberGues();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.nextLine());
        Player player2 = new Player(scanner.nextLine());
        Player[] players = new Player[2];


        Random generator = new Random();
        int random = generator.nextInt(100) + 1;

        player1.setNumberPlayer(scanner.nextInt());
        player2.setNumberPlayer(scanner.nextInt());
        String answer = scanner.nextLine();


        numberGues.tooHighTooLow(random, players);


    }

    public void nextGame(String anwesr) {
        if (anwesr.equals("yes")) {
            Random generator = new Random();
            int random = generator.nextInt(100) + 1;
            numberGues.tooHighTooLow(random, );
        }


    }
}
