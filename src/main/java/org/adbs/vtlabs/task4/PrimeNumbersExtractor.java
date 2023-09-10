package org.adbs.vtlabs.task4;

import java.util.List;
import java.util.Objects;

public class PrimeNumbersExtractor {
    private static boolean isValuePrime(Long value) {
        long sqrt = (long) Math.sqrt(value);
        for (long i = 2;i <= sqrt;i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static List<Long> extract(List<Long> source) {
        return source.stream()
                .filter(Objects::nonNull)
                .filter(value -> value > 1)
                .filter(PrimeNumbersExtractor::isValuePrime)
                .toList();
    }
}
