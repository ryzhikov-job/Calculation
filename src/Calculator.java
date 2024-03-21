import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Calculator {
    private Operation operation;
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());
    private static final String LOG_FILE = "calculator.log";

    static {
        try {
            FileHandler fileHandler = new FileHandler(LOG_FILE);
            fileHandler.setLevel(Level.ALL);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error initializing log file", e);
        }
    }

    public Calculator(Operation operation) {
        this.operation = operation;
    }
    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.operate(num1, num2);
        logger.log(Level.INFO, "Calculation: {0} {1} {2} = {3}",
                new Object[]{num1,operation.getClass().getSimpleName(), num2, result});
        return result;
    }
}
