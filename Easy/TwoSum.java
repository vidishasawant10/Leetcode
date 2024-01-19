import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
    //to track the elements visisted and its index so k=element and v= index of the element
        Map<Integer,Integer> visited = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            //calculate the diff
            int diff = target - nums[i];
            // if diff is in the hashmap key 
            if (visited.containsKey(diff)){
                // then return a new array of the diff value i.e the index of element, current element index 
                return new int[]{visited.get(diff),i};
            }
            // else add the element and its value in hashmap
            visited.put(nums[i],i);
        }
        return null;
    }
    
}

