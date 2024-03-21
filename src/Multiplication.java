public class Multiplication implements Operation{
    @Override
    public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imagPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imagPart);
    }
}
