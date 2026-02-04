import java.util.HashMap;
import java.util.Map;

/**
 * CodingBat: Map-2 > wordMultiple
 * <p>
 * Given an array of strings, return a Map<String, Boolean>.
 * Return:Each different string is a key and its value is true if that string appears 2 or more times in the array.
 * </p>
 * <pre>{@code
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 * }</pre>
 * @author Mengyuan Ding
 * @since 2026-02-03
 * course CS5004 (Object-Oriented Programming)
 */

public class wordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String s : strings) {
            if (result.containsKey(s)) {
                result.put(s, true);
            } else {
                result.put(s, false);
            }
        }
        return result;
    }
}
