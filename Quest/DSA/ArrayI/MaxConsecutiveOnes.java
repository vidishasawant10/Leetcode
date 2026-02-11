//Time complexity: O(n)
//Space complexity: O(1)
public class MaxConsecutiveOnes {
     public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int currCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currCount++;
            }else{
                count = Math.max(count, currCount);
                currCount = 0;

            }

        }
        return Math.max(count, currCount);
        
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        int ans = obj.findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
}
