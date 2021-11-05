package lessons2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf("m", "wolf1", 12, 8, "black");

        System.out.println(wolf);

        wolf.go();
        wolf.run();
        wolf.voice();
        wolf.hunt();
    }
}
