package org.adbs.vtlabs.task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersExtractorTest {

    @Test
    @DisplayName("Task4: Извлечение простых чисел из массива")
    void extract() {
        List<Long> source = Arrays.asList(null, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L,
                9L, 10L, 11L, 23L, 31L, 49L, 53L);
        List<Long> expected = Arrays.asList(2L, 3L, 5L, 7L, 11L, 23L, 31L, 53L);
        List<Long> actual = PrimeNumbersExtractor.extract(source);

        assertEquals(expected, actual);
    }
}