package org.adbs.vtlabs.task1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FormulaComputerTest {

    @Test
    @DisplayName("Task1: Посчитать значение для x = 22.5, y = 14.3: OK")
    void compute1() {
        double argumentX = 22.5, argumentY = 14.3;
        double expectedLeft = 22.5658, expectedRight = 22.5659;
        double actual = FormulaComputer.compute(argumentX, argumentY);

        assertTrue(expectedLeft < actual && expectedRight > actual);
    }

    @Test
    @DisplayName("Task1: Посчитать значение для x = 5.22, y = 1.87: OK")
    void compute2() {
        double argumentX = 5.22, argumentY = 1.87;
        double expectedLeft = 5.4339, expectedRight = 5.43399;
        double actual = FormulaComputer.compute(argumentX, argumentY);

        assertTrue(expectedLeft < actual && expectedRight > actual);
    }
}