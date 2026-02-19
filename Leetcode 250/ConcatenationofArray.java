//time Complexity: O(n)
//Space Complexity: O(n) because we are creating a new array of size 2n to store the concatenated result, which requires space proportional to the size of the input array.
class ConcatenationofArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i = 0 ; i < n; i++){
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;

    }

    public static void main(String args[]){
        int[] nums = {1,2,3};
        ConcatenationofArray obj = new ConcatenationofArray();
        int[] result = obj.getConcatenation(nums);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
    }
}