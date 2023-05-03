def maxSubArray(self, nums: list[int]) -> int:
        currentSum = maxSum = nums[0]

        for i in range(1 , len(nums)):
            currentSum = max(nums[i], currentSum + nums[i])
            maxSum = max(maxSum,currentSum)
        return maxSum