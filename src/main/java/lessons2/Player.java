package lessons2;

public class Player {
    private String firstName;
    private int numberPlayer;

    public Player(String name) {
        firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }
}
