import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {

        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {

            int p1 = log.indexOf(':');
            int p2 = log.indexOf(':', p1 + 1);

            int id = Integer.parseInt(log.substring(0, p1));
            boolean isStart = log.charAt(p1 + 1) == 's';
            int time = Integer.parseInt(log.substring(p2 + 1));

            if (isStart) {
                if (!st.isEmpty()) {
                    res[st.peek()] += time - prevTime;
                }
                st.push(id);
                prevTime = time;
            } 
            else {
                res[st.pop()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ExclusiveTimeOfFunctions obj = new ExclusiveTimeOfFunctions();
        List<String> logs = List.of("0:start:0","1:start:2","1:end:5","0:end:6");
        int n = 2;
        int[] res = obj.exclusiveTime(n, logs);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
