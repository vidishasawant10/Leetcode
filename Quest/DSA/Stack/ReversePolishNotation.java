
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<>(); // will store numbers here
        // will iterate over this array
        for (String token: tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else {
                    result = a / b; // truncates toward zero (yaani ki decimals khatam end ke)
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        ReversePolishNotation obj = new ReversePolishNotation();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(obj.evalRPN(tokens));
    }

}
