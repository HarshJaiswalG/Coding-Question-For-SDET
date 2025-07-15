//import java.util.Arrays;
//
//public class s2contains1ornot {
//
//    String s1="ab";
//    String s2="eidbaooo";
//
//    public boolean checkInclusion(String s1, String s2) {
//        int n = s1.length();
//        if (n > s2.length()) return false;
//
//        char[] s1Sorted = s1.toCharArray();
//        Arrays.sort(s1Sorted);
//
//        for (int i = 0; i <= s2.length() - n; i++) {
//            String window = s2.substring(i, i + n);
//            char[] windowChars = window.toCharArray();
//            Arrays.sort(windowChars);
//            if (Arrays.equals(s1Sorted, windowChars)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//}



import java.util.Arrays;

public class s2contains1ornot {

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Count, windowCount)) return true;

        for (int i = n; i < m; i++) {
            windowCount[s2.charAt(i) - 'a']++;
            windowCount[s2.charAt(i - n) - 'a']--;
            if (Arrays.equals(s1Count, windowCount)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        s2contains1ornot checker = new s2contains1ornot();
        String s1 = "ab";
        String s2 = "eibdaooo";
        boolean result = checker.checkInclusion(s1, s2);
        System.out.println("Does s2 contain a permutation of s1? " + result);
    }
}