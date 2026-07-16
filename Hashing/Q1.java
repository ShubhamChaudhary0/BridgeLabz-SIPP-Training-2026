import java.util.*;

class Q1 {
    public boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();

        for (String token : tokens) {
            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }
}
