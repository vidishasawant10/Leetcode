class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length() > str1.length()){
            return gcdOfStrings(str2,str1);
        }
        if (str1.equals(str2)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }

        return "";
        
    }
}

/*Step 1 - If the length of str2 is greater than the length of str1, swap the strings and call the function recursively to ensure that str1 is the longer string.

Step 2 - If str1 is equal to str2, then the GCD is found, and we return str1.

Step 3 - If str2 is a prefix(a part of) of str1, then we recursively call the function with the remaining part of str1 after removing str2 as a prefix.

Step 4 - If none of the above conditions are met, there is no common prefix, and we return an empty string.*/