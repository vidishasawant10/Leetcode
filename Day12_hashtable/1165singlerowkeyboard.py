def calculateTime(keyboard: str, word: str) -> int:
        d = {}
        for idx, char in enumerate(keyboard):
            d[char] = idx

        curr = 0
        count = 0
        for char in word:
            count += abs(d[char] - curr)
            curr = d[char]
        return count

keyboard = "abcdefghijklmnopqrstuvwxyz"
word = "cba"
print(calculateTime(keyboard,word))