values = {
    "I" : 1,
    "V" : 5,
    "X" : 10,
    "L" : 50,
    "C" : 100,
    "D" : 500,
    "M" : 1000,
}
class Solution:
    def romanToInt(s: str) -> int:

        total  =  0
        for i in range(len(s)):
            if i+1 < len(s) and values[s[i]] < values [s[i+1]]:
                total -= values[s[i]]
            else:
                total += values[s[i]]

        return total
    
t = Solution("III")
print(t)