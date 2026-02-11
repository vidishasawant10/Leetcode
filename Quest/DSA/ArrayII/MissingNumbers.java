//Time Complexity: O(n) where n is the length of the input array
//Space Complexity: O(1) because we are modifying the input array in place and not using any extra space for another data structure
import java.util.*;

public class MissingNumbers {
        public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1; //4-1 = 3

            if(nums[index] > 0){
                nums[index] = -nums[index]; //we mark the number on index 3 as visited because our first no was 4
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                res.add(i+1); //because all the no we found are - so whatever is plus it means the that index +1 is the number that is missing
            }
        }
        return res;
    }
    public static void main(String[] args) {
        MissingNumbers obj = new MissingNumbers();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = obj.findDisappearedNumbers(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    
}
