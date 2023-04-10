def maxProfit(prices: list[int]) -> int:
        left = 0 #buy
        right = 1 #sell
        max_profit = 0

        while right < len(prices):
            current_profit = prices[right] - prices[left]
            if prices[left] < prices[right]:
                max_profit = max(max_profit, current_profit)
            else:
                left = right
            right += 1

        return max_profit

prices = [7,1,5,3,6,4]
print(maxProfit(prices))