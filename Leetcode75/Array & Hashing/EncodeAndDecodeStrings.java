import java.util.*;
public class EncodeAndDecodeStrings {
    public String encode(List<String> strs){
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str){
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1, j+1+len); //where j+1+len? because we want to get the word after the '#' character and the length of the word is len, so we need to add len to j+1 to get the end index of the word
            res.add(word);
            i = j + 1 + len; //move to the next word
        }
        return res;
    }
    public static void main(String[] args) {
        EncodeAndDecodeStrings eds = new EncodeAndDecodeStrings();
        List<String> strs = Arrays.asList("Hello", "World", "Leetcode");
        String encoded = eds.encode(strs);
        System.out.println("Encoded string: " + encoded);
        List<String> decoded = eds.decode(encoded);
        System.out.println("Decoded strings: " + decoded);
    }
    
}
