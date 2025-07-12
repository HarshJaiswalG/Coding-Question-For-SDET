import java.util.Stack;

public class ReverseStringWithSpaces {

    public static void main(String args[]) {
        String s = "Harsh jaiswal is from Paytm";

//        char[] str = s.toCharArray();
//        Stack<Character> stack = new Stack<>();
//
//        for(char ch:str) {
//            if(ch!=' ') stack.push(ch);
//        }
//        for (int i=0;i<str.length;i++){
//            if(str[i]!=' '){
//                str[i]=stack.pop();
//            }
//        }
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c!=' ')
            stack.push(c);
        }
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                System.out.print(" ");
            else
                System.out.print(stack.pop());
        }
//        System.out.println(new String(str));
    }
}
