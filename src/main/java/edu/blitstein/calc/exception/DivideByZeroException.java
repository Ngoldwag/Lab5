package edu.blitstein.calc.exception;

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException() {
        super("Dividing by Zero!");
    }

}
