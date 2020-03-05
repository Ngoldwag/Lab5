package edu.blitstein.calc.engine.op;

public enum BinaryOperation {
    PLUS("+") {
          public double apply(double x, double y) {
            return x + y;
          }
        },
    TIMES("*") {
          public double apply(double x, double y) {
            return x * y;
          }
        };

    private final String symbol;

    BinaryOperation(String symbol) {
      this.symbol = symbol;
    }

    @Override
    public String toString() {
      return symbol;
    }

    public abstract double apply(double x, double y) throws ArithmeticException;
}