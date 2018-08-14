package LeetCode;

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1; i > 0; i-- ) {
            if (citations[i] >= citations.length - i && citations[i - 1] <= citations.length - i) {
                return citations.length - i;
            }
        }
        if (citations[0] >= citations.length) return citations.length;
        else return 0;
    }
}