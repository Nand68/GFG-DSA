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
