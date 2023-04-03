from collections import Counter
import heapq
def topKFrequent(nums: list[int], k: int) -> list[int]:
    c = Counter(nums)
    c = [(-v,k) for k,v in c.items()]
    heapq.heapify(c)
    output =[]
    for i in range(k):
        item = heapq.heappop(c)
        output.append(item[1])
    return output

nums =[1,1,1,2,2,3]
k=2
print(topKFrequent(nums,k))