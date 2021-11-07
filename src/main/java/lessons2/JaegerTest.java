package lessons2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger GipsyDanger = new Jaeger("Gipsy Danger", 1980, 260, 7, 8, 6);
        Jaeger StrikerEureka = new Jaeger("Striker Eureka", 1850, 250, 10, 10, 9);

        GipsyDanger.setArmor(12);
        System.out.println(GipsyDanger.getArmor());
        StrikerEureka.voice(GipsyDanger);
    }
}
