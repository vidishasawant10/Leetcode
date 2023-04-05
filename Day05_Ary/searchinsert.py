def searchInsert(nums: list[int], target: int) -> int:
        beg=0
        end=len(nums)-1       
        while beg <= end:
            mid=(beg+end)//2
            if nums[mid]==target:
                return mid
            if target>nums[mid]:
                beg=mid+1
            else:
                end=mid-1
                
        return beg

nums = [1,3,5,6]
target = 5

print(searchInsert(nums,target))
        