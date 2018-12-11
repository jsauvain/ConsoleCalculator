package ch.jooel.consolecalculator;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (args.length < 2) {
            System.err.println("Please add two arguments");
            throw new RuntimeException();
        }
        System.out.println("Console Calculator");
        System.out.println("==================");
        int number1 = parseArg(args[0]);
        int number2 = parseArg(args[1]);
        try {
            System.out.println("Summe von " + number1 + " + " + number2 + " = " + calculator.addition(parseArg(args[0]), parseArg(args[1])));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Integer parseArg(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            System.err.println("Please add two arguments");
            throw new RuntimeException();
        }
    }

}
