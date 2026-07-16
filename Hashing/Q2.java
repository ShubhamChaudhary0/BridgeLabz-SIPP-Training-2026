import java.util.*;

class Q2 {
    public int mostFrequentErrorCode(int[] codes) {
        Map<Integer, Integer> freq = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {
            int count = freq.merge(code, 1, Integer::sum);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }
}
