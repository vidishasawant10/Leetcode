import java.util.*;
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k){
        List<Integer>[] buckets = new List[nums.length+1];
        //we use hashmap to count the frequency of each element
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
           count.put(num, count.getOrDefault(num, 0) + 1);
        }
        //we use bucket sort to group the elements by their frequency and store them in the buckets array
        //why bucket sort and not any other sorting algorithm? because we want to group the elements by their frequency and we can do that in O(n) time using bucket sort
        for(int key: count.keySet()){
            int freq = count.get(key);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        //we iterate from the highest frequency to the lowest and add elements to the result array
        for(int i = buckets.length - 1; i >= 0 && index < k; i--){
            if(buckets[i] != null){
                for(int num: buckets[i]){
                    result[index++] = num;
                    if(index == k) break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentElements tkfe = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = tkfe.topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
    
}
