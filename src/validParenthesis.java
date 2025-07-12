import java.util.*;

public class validParenthesis {


    public static boolean validateParenthesis(String str){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }
            else if (!stack.isEmpty() && ((ch == '}' && stack.peek() == '{') ||
                    (ch == ')' && stack.peek() == '(') ||
                    (ch == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]){
        String s="([(){}])";
        if(validateParenthesis(s)){
            System.out.println("Valid");
        }
        else System.out.println("Not Valid");
    }
}
