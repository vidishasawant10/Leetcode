def intersect(nums1: list[int], nums2: list[int]) -> list[int]:
        res = []
        for i in nums1:
            if i in nums2:
                res.append(i)
                nums2.remove(i)
        return res   

nums1 = [1,2,2,1]
nums2 = [2,2]
print(intersect(nums1,nums2))