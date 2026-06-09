import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {

    public static List<String> findPermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        // Convert string to char array for easy swapping
        char[] chars = str.toCharArray();
        backtrack(chars, 0, result);
        return result;
    }

    private static void backtrack(char[] chars, int start, List<String> result) {
        // Base case: if we reach the end of the array, a permutation is formed
        if (start == chars.length) {
            result.add(new String(chars));
            return;
        }

        // Set to track characters used at the current 'start' position
        Set<Character> seen = new HashSet<>();

        for (int i = start; i < chars.length; i++) {
            // Skip swapping if the character has already been placed at this position
            if (!seen.contains(chars[i])) {
                seen.add(chars[i]);

                swap(chars, start, i);      // Choose: Swap current element into position
                backtrack(chars, start + 1, result); // Explore: Recurse for the next index
                swap(chars, start, i);      // Unchoose: Backtrack to original state
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "AAB";
        List<String> permutations = findPermutations(input);

        System.out.println("Permutations of " + input + ":");
        System.out.println(permutations);
    }
}
