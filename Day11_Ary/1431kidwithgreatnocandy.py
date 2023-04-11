def kidsWithCandies(candies: list[int], extraCandies: int) -> list[bool]:
        res = []
        maxi = max(candies)
        for i in range(len(candies)):
            extra = candies[i] + extraCandies
            if extra >= maxi:
                res.append(True)
            else:
                res.append(False)
        return res

candies = [2,3,5,1,3]
extraCandies = 3
print(kidsWithCandies(candies, extraCandies))