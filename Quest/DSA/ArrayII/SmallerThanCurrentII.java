//Time complexity: O(n)
//Space complexity: O(1) because the frequency array is of fixed size 101, which does not depend on the input size
public class SmallerThanCurrentII {
        public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];

        //step 1: frequency
        for(int num : nums){
            freq[num]++;
        }

        //step 2: Prefix sum
        for(int i = 1; i < 101; i++){
            freq[i] += freq[i-1];
        }
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }else{
                res[i] = freq[nums[i] - 1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        SmallerThanCurrentII obj = new SmallerThanCurrentII();
        int[] nums = {8,1,2,2,3};
        int[] ans = obj.smallerNumbersThanCurrent(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
