public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();

        int counter = 6;
        while (counter >= -6) {
            System.out.println(counter);
            counter -= 2;
        }
        System.out.println();

        int one = 10;
        int sum = 0;
        do {
            one++;
            if (!((one % 2) == 0)) {

                sum = sum + one;
                System.out.println(sum);
            }
        }while (one < 20);
    }
}
