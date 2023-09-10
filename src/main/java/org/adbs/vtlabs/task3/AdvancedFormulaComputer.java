package org.adbs.vtlabs.task3;

public class AdvancedFormulaComputer {
    public static double compute(double argument) {
        return Math.tan(argument);
    }

    private static void validateParams(double lower, double upper, double step) {
        if (
                step == 0.0
                || (upper > lower && step < 0)
                || (upper < lower && step > 0)
        ) {
            throw new BadArgumentsException();
        }
    }

    public static double[][] computeTable(double lower, double upper, double step) {
        validateParams(lower, upper, step);

        int size = (int) Math.floor((upper - lower) / step);
        double[][] resultTable = new double[size][2];

        double argument = lower;
        for (int i = 0;i < size;i++) {
            resultTable[i][0] = argument;
            resultTable[i][1] = compute(argument);
            argument += step;
        }

        return resultTable;
    }
}
