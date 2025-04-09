package Easy;
// 217.Contains Duplicate
import java.util.HashSet;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();
        for (int num : nums){
            if (visited.contains(num)){
                return true;
            }
            visited.add(num);
        }
        return false;
    }
}

