//Time Complexity: O(n)
//Space Complexity: O(n)
import java.util.HashSet;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> visited = new HashSet<>();
        for(int num: nums){
            if(visited.contains(num)){
                return true;
            }else{
                visited.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(cd.containsDuplicate(nums));
    }
}
