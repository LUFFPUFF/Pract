package primitiveandobjects.calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = getCalculator(5, 5, 5);
        System.out.println(calculator.multiply());

        System.out.println(calculate(5, 5, 5));
    }

    public static int calculate(int a, int b, int c) {
        Calculator calculator = new Calculator(a, b, c);
        return calculator.multiply();
    }

    //создание объекта, который не удалится
    public static Calculator getCalculator(int a, int b, int c) {
        return new Calculator(a, b, c);
    }
}
