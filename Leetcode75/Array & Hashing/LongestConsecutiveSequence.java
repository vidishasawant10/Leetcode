import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longestStreak = 0;
        for(int num: set){
            if(!set.contains(num - 1)){
                int currentStreak = 1;
                int currentNum = num;

                while(set.contains(currentNum +1)){
                    currentNum +=1;
                    currentStreak +=1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
                }
            }
            return longestStreak;
        }
        public static void main(String[] args) {
            LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
            int[] nums = {100, 4, 200, 1, 3, 2};
            int result = lcs.longestConsecutive(nums);
            System.out.println("Longest consecutive sequence length: " + result);
        }
    }
