import java.util.HashSet;
class Solution {
    public boolean containsduplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i <nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}