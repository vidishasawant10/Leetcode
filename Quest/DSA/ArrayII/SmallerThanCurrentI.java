//Time Complexity: O(n^2)
//Space Complexity: O(n) because we are using an additional array to store the results, which has the same length as the input array
public class SmallerThanCurrentI {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;

            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] > nums[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
    public static void main(String[] args) {
        SmallerThanCurrentI obj = new SmallerThanCurrentI();
        int[] nums = {8,1,2,2,3};
        int[] ans = obj.smallerNumbersThanCurrent(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
