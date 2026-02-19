
import java.util.Stack;

public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // If current temp is warmer than stack top
            while (!stack.isEmpty() && 
                   temperatures[i] > temperatures[stack.peek()]) {

                int prevIndex = stack.pop();
                results[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }

        return results;
    }
    public static void main(String[] args) {
        DailyTemp obj = new DailyTemp();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = obj.dailyTemperatures(temperatures);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    
}
