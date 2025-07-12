public class reverseString_with_underscore_constant {

    public static void main(String args[]) {
        String s = "Harsh jaiswal is from Paytm";

        char str[] = s.toCharArray();
        char newStr[] = new char[str.length];

        for (int i = 0; i < s.length(); i++) {
            if (str[i] == ' ') {
                newStr[i] = ' ';
            }
        }

        int j = newStr.length - 1;

        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                while (newStr[j] == ' ') {
                    j--;
                }
                newStr[j] = str[i];
                j--;
            }
        }

        System.out.println(new String(newStr));
    }
}
