package org.adbs.vtlabs.task7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomSorterTest {

    @Test
    @DisplayName("Task7: Вызов метода для уже отсортированного массива")
    void sortOrdered() {
        List<Integer> source = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        CustomSorter.sort(source);
        assertEquals(expected, source);
    }

    @Test
    @DisplayName("Task7: Вызов метода для отсортированного в обатном порядке массива")
    void sortOrderedReverse() {
        List<Integer> source = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        CustomSorter.sort(source);
        assertEquals(expected, source);
    }

    @Test
    @DisplayName("Task7: Вызов метода несортированного массива массива")
    void sortUnordered() {
        List<Integer> source = Arrays.asList(1, 4, 8, 3, 2, 54, -23);
        List<Integer> expected = Arrays.asList(-23, 1, 2, 3, 4, 8, 54);

        CustomSorter.sort(source);
        assertEquals(expected, source);
    }
}