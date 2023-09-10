package org.adbs.vtlabs.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxIncreasingSubsequenceCounter {
    public static int count(List<Integer> source) {
        List<Integer> dynamicList = new ArrayList<>(Collections.nCopies(source.size(), 0));

        for (int i = 0;i < source.size();i++) {
            dynamicList.set(i, 1);
            for (int j = 0;j < i;j++) {
                if (source.get(j) < source.get(i)) {
                    dynamicList.set(i, Math.max(dynamicList.get(i), dynamicList.get(j)+1));
                }
            }
        }

        return dynamicList.stream()
                .reduce(Integer::max)
                .orElse(0);
    }
}
