package edu.blitstein.calc.engine.op;

import edu.blitstein.calc.exception.UnknownStrOpException;

public class UnaryOperationFactory {
    public static UnaryOperation getOperator(String opStr)
            throws UnknownStrOpException {
        UnaryOperation op;
        switch (opStr) {
            case "abs":
                op = UnaryOperation.ABS;
                break;
            case "invert":
                op = UnaryOperation.INVERT;
                break;
            default:
                throw new UnknownStrOpException(opStr);
        }
        return op;
    }


}

