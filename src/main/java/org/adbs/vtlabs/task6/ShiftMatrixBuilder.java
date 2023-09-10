package org.adbs.vtlabs.task6;

public class ShiftMatrixBuilder {
    public static int[][] build(int[] elements) {
        int[][] result = new int[elements.length][elements.length];
        for (int i = 0;i < elements.length;i++) {
            for (int j = 0;j < elements.length;j++) {
                result[i][j] = elements[ (j+i) % elements.length ];
            }
        }
        return result;
    }
}
