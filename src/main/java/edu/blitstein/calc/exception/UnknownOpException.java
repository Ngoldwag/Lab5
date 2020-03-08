package edu.blitstein.calc.exception;

public class UnknownOpException extends Throwable {
    public UnknownOpException(char op) { super(op + " is an unknown operator."); }
    public UnknownOpException() { super("no argument given"); }
    public UnknownOpException(String op)

    {
        super(op = " ");
    }

}
