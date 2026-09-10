import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstringFinder {
    public static int longestSubstring(String str) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            // If duplicate found, remove characters from left
            if (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String str = "abcdabcdbb";

        System.out.println(longestSubstring(str));
    }
}
