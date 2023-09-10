package org.adbs.vtlabs.task2;

public class AreaChecker {
    private static final double UPPER_X_BORDER = 4.0;
    private static final double UPPER_Y_BORDER = 5.0;
    private static final double LOWER_X_BORDER = 6.0;
    private static final double LOWER_Y_BORDER = -3.0;

    private static boolean isAboveX(double x, double y) {
        return y > 0;
    }

    private static boolean belongsToUpperArea(double x, double y) {
        return Math.abs(x) <= UPPER_X_BORDER && y <= UPPER_Y_BORDER;
    }

    private static boolean belongsToLowerArea(double x, double y) {
        return Math.abs(x) <= LOWER_X_BORDER && y >= LOWER_Y_BORDER;
    }

    public static boolean belongsTo(double x, double y) {
        if (isAboveX(x, y)) {
            return belongsToUpperArea(x, y);
        } else {
            return belongsToLowerArea(x, y);
        }
    }
}
