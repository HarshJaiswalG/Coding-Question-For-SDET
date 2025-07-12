import java.util.HashSet;


public class LongestSubstring {
    public static int findLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0, maxLen=0;
        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
    return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcdabcdebb";
        System.out.println("Longest Substring Length: " + findLongestSubstring(input)); // Output: 3
    }
}
