package lessons2;

public class Player {
    private String firstname;
    private int numberPlayer;

    public Player(String name) {
        firstname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String name) {
        firstname = name;
    }

    public int getNumberPlayer() {
        return numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }
}
