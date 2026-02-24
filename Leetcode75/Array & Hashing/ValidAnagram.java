//time complexity: O(n)
//space complexity: O(1) -> because the length of count is fixed at 26
public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        //O(1)
        if(s.length()!= t.length()){
            return false;
        }
        //O(n)
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        //O(1) because the length of count is fixed at 26
        for(int i : count){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(va.isAnagram(s, t));
    }
}

