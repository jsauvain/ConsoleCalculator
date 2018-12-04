package ch.jooel.consolecalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Nested
    class AdditionTests {

        @Test
        void givenTwoPositiveNumbersItShouldCalculateThem() {
            int firstNumber = 20;
            int secondNumber = 10;

            int result = calculator.addition(firstNumber, secondNumber);

            assertThat(result)
                    .isEqualTo(30);
        }

        @Test
        void givenTwoNegativeNumbersItShouldCalculateThem() {
            int firstNumber = -10;
            int secondNumber = -20;

            int result = calculator.addition(firstNumber, secondNumber);

            assertThat(result)
                    .isEqualTo(-30);
        }

        @Test
        void givenTwoZeroValueNumbersItShouldCalculateThem() {
            int zeroValue = 0;

            int result = calculator.addition(zeroValue, zeroValue);

            assertThat(result)
                    .isEqualTo(0);
        }

    }

    @Nested
    class SubtractionTests {
        @Test
        void givenTwoPositiveNumbersItShouldCalculateThem() {
            int firstNumber = 20;
            int secondNumber = 10;

            int result = calculator.subtraction(firstNumber, secondNumber);

            assertThat(result)
                    .isEqualTo(10);
        }

        @Test
        void givenTwoNegativeNumbersItShouldCalculateThem() {
            int firstNumber = -10;
            int secondNumber = -20;

            int result = calculator.subtraction(firstNumber, secondNumber);

            assertThat(result)
                    .isEqualTo(10);
        }

        @Test
        void givenTwoZeroValueNumbersItShouldCalculateThem() {
            int zeroValue = 0;

            int result = calculator.subtraction(zeroValue, zeroValue);

            assertThat(result)
                    .isEqualTo(0);
        }
    }

}