import java.util.Stack;

public class NumberOfValidSubarrays {
    public int validSubarrays(int[] nums) {
        //Stack to maintain indices of elements in increasing order
        Stack<Integer> stack = new Stack<>();
        int totalSubarrays = 0, arrayLength = nums.length;

        for(int currIdx = 0; currIdx < arrayLength; currIdx++){
            //while stack is not empty and current ele is smaller than stack pop
            //this means the ele at stack top cannot exten further right

            while(!stack.isEmpty() && nums[currIdx] < nums[stack.peek()]){
                //pop the idx and calculate how many subarrays it can form as minimum
                int popIdx = stack.pop();
                //no.of valid subarrays = currIdx - popIdx
                totalSubarrays += (currIdx - popIdx);
            }
            //Add cuuIdx to stack
            stack.push(currIdx);
        }
        //handle remaining eles in stack (they can extend to the end)
        while(!stack.isEmpty()){
            int popIdx = stack.pop();
            totalSubarrays += (arrayLength - popIdx);
        }
        return totalSubarrays;
    }
    public static void main(String[] args) {
        NumberOfValidSubarrays obj = new NumberOfValidSubarrays();
        int[] nums = {1, 4, 2, 5, 3};
        System.out.println(obj.validSubarrays(nums));
    }
}
