import java.util.Stack;

public class reverseWords {
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] words = s.trim().split("\\s+");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop()).append(" ");
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "I love Deutsche Telekom";
        System.out.println(reverseWords(input)); // Output: "Telekom Deutsche love I"
    }
}
