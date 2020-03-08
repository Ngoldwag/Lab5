package edu.blitstein.calc.exception;

public class UnknownCharOpException extends Throwable {
    public UnknownCharOpException(char op)
    {
        super(op + " is an unknown operator.");
    }

}
