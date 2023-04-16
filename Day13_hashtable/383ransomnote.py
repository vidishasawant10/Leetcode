def canConstruct(ransomNote: str, magazine: str) -> bool:
        for i in set(ransomNote):
            if magazine.count(i) < ransomNote.count(i):
                return False
            return True
        
ransomNote = "aa" 
magazine = "aab"
print(canConstruct(ransomNote,magazine))
        