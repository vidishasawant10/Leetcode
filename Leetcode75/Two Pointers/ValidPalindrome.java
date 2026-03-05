public class ValidPalindrome {
    public boolean isPalindrome(String s){
        int start = 0, end = s.length() - 1;
        while (start < end){
            char l = s.charAt(start);
            char r = s.charAt(end);
            if(l >= 'A' && l <='Z') l = (char)(l+32);
            if(r >= 'A' && r <='Z') r = (char)(r+32);

            if(!(l>='a' && r <='z') ||(l>='0' && l <= '9')){
                start++;
                continue;
            }
            if(!(r>='a' && r <='z') ||(r>='0' && r <= '9')){
                end--;
                continue;
            }
            if(l != r) return false;
            
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("Was it a car or a cat I saw?"));
    }
    
}
