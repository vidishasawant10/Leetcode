def twoSum(nums: list[int], target: int) -> list[int]:
        dicc ={}
        for i in range(len(nums)):
            if target -nums[i] in dicc:
                return [i,dicc[target -nums[i] ]]
            else:
                dicc[nums[i]]=i

nums = [2,7,11,15]
target = 9
print(twoSum(nums,target))