package lessons2;

public class Calculator {

    public Number calculate(char mathSign, int firstNumber, int secondNumber) {
        switch (mathSign) {
            case '+' :
                return plus(firstNumber, secondNumber);
            case '/' :
                return division(firstNumber, secondNumber);
            case '*' :
                return multiplication(firstNumber, secondNumber);
            case '-' :
                return subtraction(firstNumber, secondNumber);
            case '^' :
                return exponentiation(firstNumber, secondNumber);
            case '%' :
                return remainderDivision(firstNumber, secondNumber);
            }
            return null;

        }

    public int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public double division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int exponentiation(int firstNumber, int step) {
        for (int i = 0; i <= step; i++) {
            firstNumber = firstNumber * firstNumber;
        }
        return firstNumber;
    }

    public int remainderDivision(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
