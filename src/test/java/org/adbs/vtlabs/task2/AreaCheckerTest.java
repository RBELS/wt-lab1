package org.adbs.vtlabs.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCheckerTest {

    @Test
    @DisplayName("Task2: Точка принадлежит 1 или 2 четверти")
    void belongsTrueUpper() {
        double x = -4.0, y = 5.0;
        assertTrue(AreaChecker.belongsTo(x, y));
    }

    @Test
    @DisplayName("Task2: Точка не принадлежит 1 или 2 четверти")
    void belongsFalseUpper() {
        double x = -4.1, y = 5.0;
        assertFalse(AreaChecker.belongsTo(x, y));
    }

    @Test
    @DisplayName("Task2: Точка принадлежит 3 или 4 четверти")
    void belongsTrueLower() {
        double x = 6.0, y = -3.0;
        assertTrue(AreaChecker.belongsTo(x, y));
    }

    @Test
    @DisplayName("Task2: Точка не принадлежит 3 или 4 четверти")
    void belongsFalseLower() {
        double x = 6.0, y = -3.2;
        assertFalse(AreaChecker.belongsTo(x, y));
    }
}