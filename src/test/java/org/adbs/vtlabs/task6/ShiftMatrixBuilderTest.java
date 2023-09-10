package org.adbs.vtlabs.task6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShiftMatrixBuilderTest {

    @Test
    @DisplayName("Task 6: Построение матрицы из задания на базе массива")
    void build() {
        int[] source = new int[] {1, 2, 3, 4, 5};
        int[][] expected = new int[][] {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}
        };
        int[][] actual = ShiftMatrixBuilder.build(source);

        for (int i = 0;i < expected.length;i++) {
            for (int j = 0;j < expected[i].length;j++) {
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }
}