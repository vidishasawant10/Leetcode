def maximumWealth(accounts: list[list[int]]) -> int:
        maxwealthsofar = 0
        for account in accounts:
            curr_cust_wealth = sum(account)
            maxwealthsofar = max(maxwealthsofar, curr_cust_wealth)
        return maxwealthsofar

accounts = [[1,2,3],[3,2,1]]
print(maximumWealth(accounts))