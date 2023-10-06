import java.util.*;
class monotonicarray {
    public boolean isMonotonic(int[] nums){
        boolean increase = true;
        boolean decrease = false;

        for (int i =0; i< nums.length-1;i++){
            if (nums[i] > nums[i+1]){
                increase = false;
            }
            if (nums[i] < nums[i+1]){
                decrease = false;
            }
        }
        return increase || decrease;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter the Elements in Array");
        int nums[] = new int[n];
        for (int i = 0; i < n; ++i){
            nums[i] = sc.nextInt();
        }
        System.out.println("Nums = "+Arrays.toString(nums));
        monotonicarray obj = new monotonicarray();
        boolean result = obj.isMonotonic(nums);
        System.out.println("Output = "+result);

    }
}
