package cw08.exceptions;

public class NegativeSalaryValueException extends Exception {
    private static final String DEFAULT_MESSAGE = "Negative salary value";

    public NegativeSalaryValueException(String message) {
        super(message);
    }

    public NegativeSalaryValueException() {
        super(DEFAULT_MESSAGE);
    }
}
