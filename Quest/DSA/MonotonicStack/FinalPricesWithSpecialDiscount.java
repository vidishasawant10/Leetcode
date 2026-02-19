public class FinalPricesWithSpecialDiscount{
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = prices.clone();

        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] <= prices[i]){
                    answer[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        FinalPricesWithSpecialDiscount obj = new FinalPricesWithSpecialDiscount();
        int[] prices = {8,4,6,2,3};
        int[] ans = obj.finalPrices(prices);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}