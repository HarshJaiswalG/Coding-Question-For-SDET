import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for( char c:s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for( char ch:t.toCharArray())
        {
            if(!map.containsKey(ch)){
                return false;
            }

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }

            if(map.get(ch)<0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ratr";
        String s2 = "rrat";

        System.out.println(isAnagram(s1, s2));  // Output: true
    }
}
