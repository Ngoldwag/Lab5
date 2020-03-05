package edu.blitstein.calc.exception;

import edu.blitstein.calc.engine.op.BinaryOperation;

public class UnknownOpException extends Throwable {
    public UnknownOpException(BinaryOperation op)
    {
        super(op + " is an unknown operator.");
    }

    public UnknownOpException(char opChar) {
    }
}