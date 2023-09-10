package org.adbs.vtlabs.task8;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
    public static List<Integer> getMergeIds(List<Double> dest, List<Double> source) {
        List<Integer> idList = new ArrayList<>();
        int destI = 0, srcI = 0;
        while (destI < dest.size() || srcI < source.size()) {
            if (destI >= dest.size() || source.get(srcI) <= dest.get(destI)) {
                idList.add(srcI+destI);
                srcI++;
            } else {
                destI++;
            }
        }
        return idList;
    }
}
