def canPermutePalindrome(s: str) -> bool:
        sets = set()
        
        for char in s:
            if char not in sets:
                sets.add(char)
            else:
                sets.remove(char)

        return (len(sets)<=1)

s = "code"
#s = "aab"
print(canPermutePalindrome(s))

