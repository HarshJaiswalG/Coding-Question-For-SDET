import java.util.HashSet;


public class LongestSubstring {
//    public static int findLongestSubstring(String s) {
//        HashSet<Character> set = new HashSet<>();
//        int left=0, maxLen=0;
//        for(int right=0;right<s.length();right++)
//        {
//            while(set.contains(s.charAt(right))){
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(s.charAt(right));
//            maxLen=Math.max(maxLen,right-left+1);
//        }
//    return maxLen;
//    }

    public static int findLongestSubstring(String s)
    {
        int[] index = new int[128]; // ASCII character set
        int maxLen = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(index[currentChar], left); // Move left pointer if needed
            maxLen = Math.max(maxLen, right - left + 1); // Update max length
            index[currentChar] = right + 1; // Update the last seen index (+1 to avoid zero index confusion)
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String input = "abcdabcdegbb";
        System.out.println("Longest Substring Length: " + findLongestSubstring(input)); // Output: 3
    }
}
