public class ReverseStringRecursion {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) +str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Harsh Jaiswal";
        System.out.println("Reversed String: " + reverse(input));
    }
}
