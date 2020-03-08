package edu.blitstein.calc.engine;

import edu.blitstein.calc.engine.op.UnaryOperation;
import edu.blitstein.calc.engine.op.UnaryOperationFactory;
import edu.blitstein.calc.exception.DivideByZeroException;
import edu.blitstein.calc.exception.UnknownOpException;

public class UnaryCalculator {
    private double result;
    private final double precision = 0.001;

    public UnaryCalculator() {
        this(0.0);
    }

    public UnaryCalculator(double initialValue) {
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
    public double evaluate(String opStr, double n1)
            throws DivideByZeroException, UnknownOpException {
        double answer;
        UnaryOperation op = UnaryOperationFactory.getOperator(opStr);
        answer = op.apply(n1);
        return answer;


    }}
