package lessons2;

public class Player {
    private String firstName;
    private int number;

    public Player(String name) {
        firstName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
