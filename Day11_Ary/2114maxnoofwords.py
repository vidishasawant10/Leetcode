def mostWordsFound(sentences: list[str]) -> int:
        maxcount = 0

        for i in range(len(sentences)):
            sentences[i] = sentences[i].count(' ')+1 
            maxcount = max(maxcount,sentences[i])
        return maxcount

sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
print(mostWordsFound(sentences))