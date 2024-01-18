package arithmeticcalculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        int a = scanner();
        int b =scanner();

        System.out.println("Введите тип операции: (1 - сложение, 2 - умножение, 3 - вычитание)");
        int type = scanner();

        ArithmeticCalculator calculator = new ArithmeticCalculator(a, b);

        Operation operation = operationType(type);

        System.out.println("Результат операции: " + calculator.calculate(Objects.requireNonNull(operation)));
    }

    private static int scanner() {
        int num = 0;
        boolean isValidateInput = false;
        while (!isValidateInput) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                isValidateInput = true;
            } else {
                System.out.println("Вы вводите не число");
                scanner.next();
            }
        }
        return num;
    }

    private static Operation operationType(int type) {
        if (type == 1) {
            return Operation.ADD;
        } else if (type == 2) {
            return Operation.MULTIPLY;
        } else if (type == 3) {
            return Operation.SUBTRACT;
        }
        return null;
    }
}