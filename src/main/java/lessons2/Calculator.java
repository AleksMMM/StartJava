package lessons2;

public class Calculator {

    public Number swithMethod(char ch, int one, int two) {
        switch (ch) {
            case   '+' :
                return plus(one, two);
            case '/' :
                return del(one, two);

            case '*' :
                return umn(one, two);

            case '-' :
                return minus(one, two);

            case '^' :
                return step(one, two);

            case '%' :
                return delMod(one, two);


            }
            return null;

        }

    public int plus(int one, int two) {
        return one + two;
    }

    public double del(int one, int two) {
        return one / two;
    }

    public static int umn(int one, int two) {
        return one * two;
    }

    public static int minus(int one, int two) {
        return one - two;
    }

    public int step(int one, int step) {
        for (int i = 0; i <= step; i++) {
            one = one * one;
        }

        return umn(one, one);
    }

    public int delMod(int one, int two) {
        return one % two;
    }



}
