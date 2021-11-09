package lessons2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", 1980, 260, 7, 8, 6);
        Jaeger strikerEureka = new Jaeger("Striker Eureka", 1850, 250, 10, 10, 9);

        gipsyDanger.setArmor(12);
        System.out.println(gipsyDanger.getArmor());
        strikerEureka.voice(gipsyDanger);
    }
}
