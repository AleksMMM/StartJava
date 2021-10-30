import java.util.Scanner;

// немного недоделал калькулятор, просто времени для занятий немного и я это задание уже выполнял несколько раз

public class Calculator {

    public static void main(String[] args) {

        int first = 10;
        int second = 5;
        char[] chars = new char[6];
        chars[0] = '+';
        chars[1] = '-';
        chars[2] = '*';
        chars[3] = '/';
        chars[4] = '^';
        chars[5] = '%';

        chars.toString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите операцию");
        int mathOpp = scanner.nextInt();
        System.out.println("работаем?");
        int tr = scanner.nextInt();

        while (tr == 0) {

           if (mathOpp == 1) {
               System.out.println(plus(first, second));
           }else if(mathOpp == 2) {
               System.out.println(minus(first, second));
           }else if(mathOpp == 3) {
               System.out.println(umn(first, second));
           }

            System.out.println("работаем?");
            tr = scanner.nextInt();
        }

    }

    public static int umn(int one, int two) {
        return one * two;
    }

    public double del(int one, int two) {
        return one / two;
    }

    public static int minus(int one, int two) {
        return one - two;
    }

    public static int plus(int one, int two) {
        return one + two;
    }

    public int step(int one) {
        return umn(one, one);
    }

    public int delMod(int one, int two) {
        return one % two;
    }




}

