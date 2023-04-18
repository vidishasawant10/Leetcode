class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        dicc = {}
        for i in range(len(nums)):
            if target - nums[i] in dicc:
                return [i,dicc[target - nums[i]]]
            dicc[nums[i]] = i

        