def smallerNumbersThanCurrent(nums: list[int]) -> list[int]:
        res = []
        for i in range(len(nums)):
            count = 0
            for j in range(len(nums)):
                if j != i and nums[j] < nums[i]:
                    count+=1
            res.append(count)
        return res

nums = [8,1,2,2,3]
print(smallerNumbersThanCurrent(nums))