
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] =1;
        //we calculate the product of all the elements to the left of the current element and store it in the ans array
        for(int i = 1; i < n; i++){
            ans[i] = nums[i-1] * ans[i-1];
        }

        //we calculate the product of all the elements to the right of the current element  
        int right = 1;
        for(int i = n-1; i >=0; i--){
            ans[i] = ans[i] * right;
            right*= nums[i];
        }
        return ans;

    }
    public static void main(String[] args) {
        ProductOfArrayExceptSelf paes = new ProductOfArrayExceptSelf();
        int[] nums = {1,2,3,4};
        int[] result = paes.productExceptSelf(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}
