package ch.jooel.consolecalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void givenTwoPositiveNumbersItShouldCalculateThem() {
        int firstNumber = 20;
        int secondNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.addition(firstNumber, secondNumber);

        assertThat(result)
                .isEqualTo(30);
    }

    @Test
    void givenTwoNegativeNumbersItShouldCalculateThem() {
        int firstNumber = -10;
        int secondNumber = -20;
        Calculator calculator = new Calculator();

        int result = calculator.addition(firstNumber, secondNumber);

        assertThat(result)
                .isEqualTo(-30);
    }

    @Test
    void givenTwoZeroValueNumbersItShouldCalculateThem() {
        int zeroValue = 0;
        Calculator calculator = new Calculator();

        int result = calculator.addition(zeroValue, zeroValue);

        assertThat(result)
                .isEqualTo(0);
    }

}