package ch.jooel.consolecalculator;

public class Calculator {

    public int addition(int firstNumber, int secondNumber) {
        return redirectedAddition(firstNumber, secondNumber);
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    protected int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    private int redirectedAddition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


}
