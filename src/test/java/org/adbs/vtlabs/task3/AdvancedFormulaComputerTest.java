package org.adbs.vtlabs.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedFormulaComputerTest {

    @Test
    @DisplayName("Task3: Посчитать значение функции в одной точке")
    void computeSingle() {
        double argument = 5.434;
        double expectedLower = -1.13647, expectedUpper = -1.13646;
        double actual = AdvancedFormulaComputer.compute(argument);

        assertTrue(actual > expectedLower && actual < expectedUpper);
    }

    @Test
    @DisplayName("Task3: Некорректный формат аргументов - ошибка")
    void checkArguments() {
        assertAll(
                () -> assertThrows(BadArgumentsException.class, () -> AdvancedFormulaComputer.computeTable(10, 20, -5)),
                () -> assertThrows(BadArgumentsException.class, () -> AdvancedFormulaComputer.computeTable(20, 10, 5)),
                () -> assertThrows(BadArgumentsException.class, () -> AdvancedFormulaComputer.computeTable(10, 20, 0)),
                () -> assertDoesNotThrow(() -> AdvancedFormulaComputer.computeTable(10, 20, 5))
        );
    }

    private void assertResultForArgument(double argument, double actualValue) {
        double expectedValue = AdvancedFormulaComputer.compute(argument);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @DisplayName("Task3: Получить таблицу значений функции")
    void computeTable() {
        double[][] table = AdvancedFormulaComputer.computeTable(12.0, 22.0, 3.0);

        assertAll(
                () -> assertEquals(3, table.length),
                () -> assertEquals(table[0][0], 12.0),
                () -> assertEquals(table[1][0], 15.0),
                () -> assertEquals(table[2][0], 18.0)
        );

        for (double[] pair : table) {
            assertResultForArgument(pair[0], pair[1]);
        }
    }
}