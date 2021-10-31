public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println();

        int count = 6;
        while (count >= -6) {
            System.out.println(count);
            count =count -2;
        }
        System.out.println();

        int one = 10;
        do {
            one = one + 1;
            if (!((one % 2) == 0)) {
                System.out.println(one);
            }
        }while (one < 20);
    }
}
