public class StringPermutationsBacktrack {

    public static void main(String[] args) {
        String input = "abc";
        char[] chars = input.toCharArray();
        permute(chars, 0);
    }

    public static void permute(char[] chars, int index) {
        if (index == chars.length) {
            System.out.println(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1);
            swap(chars, index, i);
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
