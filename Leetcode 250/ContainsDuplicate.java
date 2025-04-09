import java.util.HashSet;

class ContainDuplicate {
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
    }
}