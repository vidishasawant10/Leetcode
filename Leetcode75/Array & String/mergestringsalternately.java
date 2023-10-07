class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();

        while(i < w1 || j < w2){
            if (i < w1){
                result.append(word1.charAt(i++));
            }
            if(j < w2){
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
        
    }
}