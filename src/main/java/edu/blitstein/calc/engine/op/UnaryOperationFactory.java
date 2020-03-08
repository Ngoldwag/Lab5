package edu.blitstein.calc.engine.op;


import edu.blitstein.calc.exception.UnknownOpException;

public class UnaryOperationFactory {
    public static UnaryOperation getOperator(String opStr)
            throws UnknownOpException {
        UnaryOperation op;
        switch (opStr) {
            case "abs":
                op = UnaryOperation.ABS;
                break;
            case "invert":
                op = UnaryOperation.INVERT;
                break;
            default:
                throw new UnknownOpException(opStr);
        }
        return op;
    }

}

