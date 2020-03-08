package edu.blitstein.calc.exception;


public class UnknownStrOpException extends Throwable {
    public UnknownStrOpException(String op)
    {
        super(op + " is an unknown operator.");
    }

}
