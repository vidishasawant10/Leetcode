def removeDuplicates(nums: list[int]) -> int:
        size = len(nums)
        insertIndex = 1
        for i in range(1,size):
            #found unique element
            if nums[i-1] != nums[i]:
            #updating insertindex in our main array
                nums[insertIndex] = nums[i]
            #incrementing insertIndex count by 1
                insertIndex = insertIndex + 1
        return insertIndex

nums = [0,0,1,1,1,2,2,3,3,4]
print(removeDuplicates(nums))