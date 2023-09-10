package org.adbs.vtlabs.task8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListMergerTest {
    @Test
    void getMergeIds1() {
        List<Double> dest = Arrays.asList(
                10.0, 15.0, 20.0, 25.0, 30.0
        );
        List<Double> source = Arrays.asList(
                12.0, 17.0, 22.0, 27.0, 32.0
        );
        List<Integer> actual = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> expected = ListMerger.getMergeIds(dest, source);

        assertEquals(expected, actual);
    }

    @Test
    void getMergeIds2() {
        List<Double> dest = Arrays.asList(
                10.0, 15.0, 20.0, 25.0, 30.0
        );
        List<Double> source = Arrays.asList(
                2.0, 4.0, 29.0, 29.5, 32.0
        );
        List<Integer> actual = Arrays.asList(0, 1, 6, 7, 9);
        List<Integer> expected = ListMerger.getMergeIds(dest, source);

        assertEquals(expected, actual);
    }
}