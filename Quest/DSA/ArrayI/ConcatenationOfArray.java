//Time complexity: O(n)
//Space complexity: O(n)
import java.util.Arrays;
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = getConcatenation(nums);
        System.out.println("Original array: "+Arrays.toString(nums));
        System.out.println("Concatenated array: "+Arrays.toString(ans));
    }

    private static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }
    
}
