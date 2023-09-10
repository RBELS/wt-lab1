package org.adbs.vtlabs.task1;

public class FormulaComputer {
    public static double compute(double x, double y) {
        double upper = 1 + sqr(Math.sin(x + y));
        double lower = 2 + Math.abs(x - (2*x) / (1 + sqr(x) *sqr(y) ));
        return upper / lower + x;
    }

    private static double sqr(double value) {
        return value * value;
    }
}
