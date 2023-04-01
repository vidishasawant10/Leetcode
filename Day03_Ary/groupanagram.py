def groupAnagrams(strs: list[str]) -> list[list[str]]:
        dicc = {}
        for word in strs:
            sortedword = "".join(sorted(word))
            if sortedword not in dicc:
                dicc[sortedword] = [word]
            else:
                dicc[sortedword].append(word)
        result = []

        for item in dicc.values():
            result.append(item)
        return result

strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))

'''
1. take a empty dict
2. loop through the given array.
3. sort every word in the array while looping and check if the sorted word is in the dictionary.
4. if not add it to the dictionary taking sortedword as the key and the word as the value if yes append the word to value of sortedword.
5. loop through the dictionary and print all the values in the dictionary.

'''