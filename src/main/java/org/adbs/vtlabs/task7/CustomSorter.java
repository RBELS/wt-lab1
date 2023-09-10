package org.adbs.vtlabs.task7;

import java.util.List;

public class CustomSorter {
    private static void swap(List<Integer> source, int a, int b) {
        Integer temp = source.get(a);
        source.set(a, source.get(b));
        source.set(b, temp);
    }

    public static void sort(List<Integer> source) {
        int i = 0;
        while (i < source.size()-1) {
            i = Math.max(0, i);
            if (source.get(i) > source.get(i+1)) {
                swap(source, i, i+1);
                i--;
            } else {
                i++;
            }
        }
    }
}
