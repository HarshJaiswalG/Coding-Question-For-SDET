import java.util.Arrays;
import java.util.Stack;

public class nextLargestNumber {
    public static void main(String[] args) {
        int[] a = {6, 0, 8, 1, 3};
        int n = 5;
        int nextElement;
        Stack<Integer> stack = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[i] >= stack.peek()) {
                stack.pop();
            }
            nextElement = stack.isEmpty() ? -1 : stack.peek();
            stack.push(a[i]);
            a[i]=nextElement;
        }

        System.out.print(Arrays.toString(a));
    }
}