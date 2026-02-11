//Time Complexity: O(n)
//Space Complexity: O(1)
public class SetMismatch {
        public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                duplicate = Math.abs(nums[i]);
            }else{
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                missing = i+1;
            }
        }
        return new int[]{duplicate, missing};
    }
    public static void main(String[] args) {
        SetMismatch obj = new SetMismatch();
        int[] nums = {1,2,2,4};
        int[] ans = obj.findErrorNums(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
