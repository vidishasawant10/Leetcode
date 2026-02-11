//Time Complexity: O(n)
//Space Complexity: O(n)
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int idx = 0;

        for(int i = 0; i < n; i++){
            ans[idx++] = nums[i];
            ans[idx++] = nums[i+n];
        }
        return ans;
    }
    public static void main(String[] args) {
        ShuffleTheArray obj = new ShuffleTheArray();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = obj.shuffle(nums, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}