
import java.util.Stack;


public class minStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public minStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x){
        stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }

    }
    public void pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args) {
        minStack obj = new minStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println("Minimum Element: "+obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
    
}
