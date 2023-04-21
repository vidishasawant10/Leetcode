def longestPalindrome(self, s: str) -> int:
        sets = set()
        for char in s:
            if char not in sets:
                sets.add(char)
            else:
                sets.remove(char)
            
        if len(sets) != 0:
            return len(s) - len(sets) + 1
        else:
            return len(s)
        
s = "abccccdd"
#s ="a"
print(longestPalindrome(s))