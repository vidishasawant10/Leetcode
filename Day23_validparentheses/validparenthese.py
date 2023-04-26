def isValid(self, s: str) -> bool:
        stack=[]
        openclose = {")":"(","]":"[","}":"{"}
        
        for i in s:
            if i in openclose:
                if stack and stack[-1] == openclose[i]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(i)
        return True if not stack else False
