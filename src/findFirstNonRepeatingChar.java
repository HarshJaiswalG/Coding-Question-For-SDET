import java.util.LinkedHashMap;

public class findFirstNonRepeatingChar {
    public static char findFirstNonRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("swiss"));    // Output: 'w'
        System.out.println(findFirstNonRepeatingChar("success"));  // Output: 'u'
        System.out.println(findFirstNonRepeatingChar("aabbcc"));   // Output: '_'
        System.out.println(findFirstNonRepeatingChar("racecar"));  // Output: 'e'
    }
}
