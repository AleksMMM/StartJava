package lessons2;

import java.util.Scanner;

public class NumberGues {
    private Player player;
    String answer;
    Scanner scanner;



    public void tooHighTooLow( int numbRandom, Player[] players) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].getNumberPlayer() > numbRandom) {
                System.out.println("меньше");
                System.out.println("ход переходит к " + players[i++]);
            }else if (players[i].getNumberPlayer() < numbRandom) {
                System.out.println("больше");
                System.out.println("ход переходит к " + players[i++]);
            }else {
                System.out.println("вы угадали " + player.getFirstname());
                System.out.println("хотите сыграть еще");
                answer = scanner.nextLine();

                if (answer.equals("yes")) {

                }
                break;
            }
            if (i == players.length - 1) {
                i = 0;
            }
        }
        }


}
