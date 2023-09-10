package org.adbs.vtlabs.task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxIncreasingSubsequenceCounterTest {

    @Test
    @DisplayName("Task5: Получить длину наибольшей возрастающей подпоследовательности - OK")
    void count1() {
        List<Integer> source = Arrays.asList(5, 6, 1, 5, 2, 3, 3, 4);
        int expected = 4;
        int actual = MaxIncreasingSubsequenceCounter.count(source);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Task5: Получить длину наибольшей возрастающей подпоследовательности - OK")
    void count2() {
        List<Integer> source = Arrays.asList(1223534, 1, 2, 3, 4, 5, 6, 7, 8, -20);
        int expected = 8;
        int actual = MaxIncreasingSubsequenceCounter.count(source);

        assertEquals(expected, actual);
    }
}