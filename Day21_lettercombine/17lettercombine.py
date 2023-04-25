from itertools import product
def letterCombinations(digits: str) -> list[str]:
        dic = {
            "2" : "abc",
            "3" : "def",
            "4" : "ghi",
            "5" : "jkl",
            "6" : "mno",
            "7" : "pqrs",
            "8" : "tuv",
            "9" : "wxyz",
        }

        if digits == "":
            return [] # edge case
        chars = []
        for c in digits:
            chars.append(dic[c]) # dic of the digit converted to word
            code = product(*chars) 
        list1 = []
        for k in code:
            list1.append(''.join(k))
        return list1


digits = "23"
print(letterCombinations(digits))
