//time complexity: O(n * k) where n is the number of strings and k is the average length of the strings and also we used frequency count rather than sorting the string which is O(k log k)
//space complexity: O(n * k) because in the worst case, all strings are different and we store them in the map
import java.util.*;
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){ //O(n)
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++){ //O(k) where k is the length of the string
                count[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num : count){ //O(1) because the length of count is fixed at 26
                sb.append(num).append('#'); //It acts as a separator to prevent ambiguity when converting frequency array into a string key. Without it, different frequency combinations could generate identical keys.
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = ga.groupAnagrams(strs);
        System.out.println(result);
    }
}
