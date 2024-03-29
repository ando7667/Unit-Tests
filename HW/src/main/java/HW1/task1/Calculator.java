package HW1.task1;

public class Calculator {


    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
    public static double squareRootExtraction(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new ArithmeticException("Сумма покупки не может быть равна нулю или быть отрицательной!");
        if (discountAmount < 0 || discountAmount > 100)
            throw new ArithmeticException("Сумма скидки должна быть в диапазоне от 0 до 100");

        double result = purchaseAmount - (purchaseAmount / 100 * discountAmount);
        return result;
    }
}