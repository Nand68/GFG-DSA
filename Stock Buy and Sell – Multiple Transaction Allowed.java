class Solution {
    public int maximumProfit(int prices[]) {
        Stack<Integer> sd = new Stack<>();
        int n = prices.length;
        int total = 0;
        int moral = 0;
        sd.push(prices[n-1]);
        for ( int i = n - 2; i >= 0; i--){
            if ( prices[i] > sd.peek()){
                int start = sd.peek();
                int end = sd.peek();
                while ( !(sd.isEmpty())){
                    end = sd.pop();
                }
                total += end - start;
            }
            
            sd.push(prices[i]);
        }
        if (!(sd.isEmpty())){
            int start = sd.peek();
                int end = sd.peek();
                while ( !(sd.isEmpty())){
                    end = sd.pop();
                }
            total += end - start;
        }
        return total;
    }
}

// more simple approach
// 100,180,260,310 we can say that 310-100=210 is same as 180-100+260-180+310-260 = 210

class Solution {
    public int maximumProfit(int prices[]) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the price increases from the previous day, we make a profit
            if (prices[i] > prices[i - 1]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }
}
