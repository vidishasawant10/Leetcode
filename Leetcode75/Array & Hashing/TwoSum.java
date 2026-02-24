//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
