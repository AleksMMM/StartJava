package lessons2;

public class Calculator {

    public Number calculate(char ch, int one, int two) {
        switch (ch) {
            case   '+' :
                return plus(one, two);
            case '/' :
                return division(one, two);
            case '*' :
                return multiplication(one, two);
            case '-' :
                return subtraction(one, two);
            case '^' :
                return exponentiation(one, two);
            case '%' :
                return remainderDivision(one, two);
            }
            return null;

        }

    public int plus(int one, int two) {
        return one + two;
    }

    public double division(int one, int two) {
        return one / two;
    }

    public static int multiplication(int one, int two) {
        return one * two;
    }

    public static int subtraction(int one, int two) {
        return one - two;
    }

    public int exponentiation(int one, int step) {
        for (int i = 0; i <= step; i++) {
            one = one * one;
        }

        return multiplication(one, one);
    }

    public int remainderDivision(int one, int two) {
        return one % two;
    }



}
