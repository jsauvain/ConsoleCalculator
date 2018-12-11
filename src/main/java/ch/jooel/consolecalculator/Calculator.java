package ch.jooel.consolecalculator;

public class Calculator {

    public int addition(int firstNumber, int secondNumber) {
        return redirectedAddition(firstNumber, secondNumber);
    }

    public int subtraction(int firstNumber, int secondNumber) {
        long result = (long) firstNumber - (long) secondNumber;
        checkSize(result);
        return (int) result;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        long result = (long) firstNumber * (long) secondNumber;
        checkSize(result);
        return (int) result;
    }

    protected int division(int firstNumber, int secondNumber) {
        long result = (long) firstNumber / (long) secondNumber;
        checkSize(result);
        return (int) result;
    }

    private int redirectedAddition(int firstNumber, int secondNumber) {
        long result = (long) firstNumber + (long) secondNumber;
        checkSize(result);
        return (int) result;
    }

    private void checkSize(long number) {
        if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE)
            throw new ArithmeticException("Result too big");
    }


}
