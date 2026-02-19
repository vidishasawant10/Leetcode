//Time Complexity: O(n)
//Space Complexity: O(n) because in the worst case, if all elements in the input array are unique, we will be storing all of them in the HashSet, which requires space proportional to the number of unique elements.
import java.util.HashSet;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> answer = new HashSet<>();

        for(int i : nums){
            if(answer.contains(i)){
                return true;
            }
            else{
                answer.add(i);
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,1};
        ContainsDuplicate obj = new ContainsDuplicate();
        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}