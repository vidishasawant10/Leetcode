def firstUniqChar(s: str) -> int:
        cnt = {}
        for i in s:
            if i not in cnt:
                cnt[i] = 1
            else:
                cnt[i] += 1
        for i in range(len(s)):
            if cnt[s[i]] == 1:
                return i
        return -1

s ="leetcode"
print(firstUniqChar(s))