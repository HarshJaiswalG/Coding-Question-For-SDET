public class Compress {

    public static void compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(s.charAt(s.length() - 1));
        sb.append(count);

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String s1 = "aaabbcccd";
        compress(s1);
    }
}
