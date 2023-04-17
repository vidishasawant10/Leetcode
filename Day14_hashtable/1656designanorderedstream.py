def __init__(self, n: int):
        self.stream = [None] * n
        self.ptr = 0
        

def insert(self, idKey: int, value: str) -> list[str]:
    idKey -= 1
    self.stream[idKey] = value
    if self.ptr < idKey:
        return []
    else:
        while self.ptr < len(self.stream) and self.stream[self.ptr] is not None:
            self.ptr += 1
        return self.stream[idKey:self.ptr]
        
