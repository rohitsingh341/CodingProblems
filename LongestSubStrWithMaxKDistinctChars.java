import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithMaxKDistinctChars {

    public static void main(String[] args) {
        String str = "araaci";
        int k = 2;
        System.out.println("Longest Sub Str where k is [" + k+ "]: " + getLongestSubStrLength(str, k));

        k = 1;
        System.out.println("Longest Sub Str where k is [" + k+ "]: " + getLongestSubStrLength(str, k));

        k = 3;
        System.out.println("Longest Sub Str where k is [" + k+ "]: " + getLongestSubStrLength(str, k));
    }

    private static int getLongestSubStrLength(String str, int k) {
        int windowStart = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char chr = str.charAt(windowEnd);
            charMap.put(chr, charMap.getOrDefault(chr, 0) + 1);
            while (charMap.size() > k) {
                char chrStart = str.charAt(windowStart);
                charMap.put(chrStart, charMap.get(chrStart) - 1);
                if (charMap.get(chrStart) == 0) {
                    charMap.remove(chrStart);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }
        return maxLength;
    }
}
