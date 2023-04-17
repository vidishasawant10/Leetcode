def decompressRLElist(self, nums: list[int]) -> list[int]:
        ans = []
        for i in range(1,len(nums),2):
            ans.extend([nums[i]] * nums[i-1])
        return ans