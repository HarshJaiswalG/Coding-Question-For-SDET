import java.util.Arrays;

public class Leetcode567 {
    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if (n > s2.length()) return false;

        char[] s1Sorted = s1.toCharArray();
        Arrays.sort(s1Sorted);

        for (int i = 0; i <= s2.length() - n; i++) {
            String window = s2.substring(i, i + n);
            char[] windowChars = window.toCharArray();
            Arrays.sort(windowChars);
            if (Arrays.equals(s1Sorted, windowChars)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ba", "eidbaooo")); // true
    }
}
