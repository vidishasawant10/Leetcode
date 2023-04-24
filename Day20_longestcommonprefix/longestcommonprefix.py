def longestCommonPrefix(self, strs: list[str]) -> str:
        s = ""
        if len(strs) == 0:
            return s
        if len(strs) == 1:
            return strs[0]

        for i in range(len(min(strs))):
            for j in range(1, len(strs)):
                if strs[0][i] == strs[j][i]:
                    if j == len(strs) - 1:
                        s += strs[0][i]
                else:
                    return s
        return s
