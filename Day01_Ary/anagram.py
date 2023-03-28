def isAnagram(s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        countS, countT = {}, {}

        for i in range(len(s)):
            countS[s[i]] = 1 +countS.get(s[i], 0) #occurence of each character if the character is not in the hashmap then initialize it to 0
            countT[t[i]] = 1 + countT.get(t[i], 0)
        for c in countS:  #iterate through the hashmap to see the characters are same
            if countS[c] != countT.get(c, 0): #get function used so that it doesnt throw key error and displays 0 instead
                return False
        return True

s = "anagram"
t = "nagaram"
print (isAnagram(s,t))