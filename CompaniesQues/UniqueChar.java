//Time Complexity O(N)
//Space Complexity O(1)
public class UniqueChar {
    public boolean uniqueChar(String s){
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isWhitespace(c)) continue;
            count[c-'a']++;
            if(count[c-'a'] >1){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]){
        UniqueChar uc = new UniqueChar();
        String s = "letcoda";
        System.out.println(uc.uniqueChar(s));
    }    
    
}
