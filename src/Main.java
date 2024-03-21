import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final Scanner scanner = new Scanner(System.in);
    private static ComplexNumber inputComplexNumber() {
        System.out.print("Введите реальную часть: ");
        double real = scanner.nextDouble();
        System.out.print("Введите мнимую часть: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Division());
        System.out.println("Введите первое комплексное число");
        ComplexNumber num1 = inputComplexNumber();
        System.out.println("Введите второе комлексное число");
        ComplexNumber num2 = inputComplexNumber();
        ComplexNumber result = calculator.calculate(num1, num2);
        System.out.println("Result: " + result);
    }
}