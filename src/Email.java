//Input: {abc@gmail.com , zyc@yahoo.in, cde@outlook.com, opm@yahoo.in}
//
//output: Gmail, yahoo, outlook


import java.util.HashMap;

public class Email {
    public static StringBuilder emails(String t[]) {

        StringBuilder sb = new StringBuilder();
        for (String s : t) {
            int a=s.indexOf("@");
            sb.append(s.substring(a+1) + ",");
        }

        return sb;
    }

    public static void main(String[] args) {
        String[] s1 = {"abc@gmail.com", "zyc@yahoo.in", "cde@outlook.com", "opm@yahoo.in"};

        System.out.println(emails(s1));  // Output: true
    }
}
