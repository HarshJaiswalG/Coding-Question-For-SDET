import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    // Helper function for recursion
    public static void generateSubsequences(String s, int index, String current, List<String> result) {
        // Base case: if we processed all characters
        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Choice 1: Exclude the current character
        generateSubsequences(s, index + 1, current, result);

        // Choice 2: Include the current character
        generateSubsequences(s, index + 1, current + s.charAt(index), result);
    }

    public static void main(String[] args) {
        String inputStr = "ab";
        List<String> result = new ArrayList<>();

        generateSubsequences(inputStr, 0, "", result);

        // Print the output list
        System.out.println(result);
        // Output: [, b, a, ab]
    }
}
