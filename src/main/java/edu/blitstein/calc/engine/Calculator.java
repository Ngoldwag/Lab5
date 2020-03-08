package edu.blitstein.calc.engine;

import edu.blitstein.calc.engine.op.BinaryOperation;
import edu.blitstein.calc.engine.op.BinaryOperationFactory;
import edu.blitstein.calc.engine.op.UnaryOperation;
import edu.blitstein.calc.engine.op.UnaryOperationFactory;
import edu.blitstein.calc.exception.DivideByZeroException;
import edu.blitstein.calc.exception.UnknownCharOpException;
import edu.blitstein.calc.exception.UnknownStrOpException;

public class Calculator {
    private double result;
    private final double precision = 0.001;

    public Calculator() {
        this(0.0);
    }

    public Calculator(double initialValue) {
        result = initialValue;
    }

    public void reset() {
        result = 0;
    }

    public void setResult(double newResult) {
        result = newResult;
    }

    public double getResult() {
        return result;
    }

    /**
     * Returns n1 op n2, provided op is one of '+', '', '*',or '/'.
     * Any other value of op throws UnknownOpException.
     */
    public double evaluate(char opChar, double n1, double n2)
            throws DivideByZeroException, UnknownCharOpException {
        double answer;
        BinaryOperation op = BinaryOperationFactory.getOperator(opChar);
        answer = op.apply(n1, n2);
        return answer;


}
    }
