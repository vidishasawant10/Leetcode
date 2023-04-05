def shuffle(nums: list[int], n: int) -> list[int]:
        result = [0] * (2 * n)
        for i in range(n):
            result[2 * i] = nums[i]
            result[2 * i + 1] = nums[n + i]
        return result 

nums = [2,5,1,3,4,7]
n = 3

print(shuffle(nums,n))