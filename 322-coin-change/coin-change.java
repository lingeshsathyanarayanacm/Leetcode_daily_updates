import java.util.Arrays;

class Solution {
    private int[] dp;

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int result = dfs(coins, amount);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int dfs(int[] coins, int amount) {
        if (amount == 0) return 0;  
        if (amount < 0) return Integer.MAX_VALUE; 

        if (dp[amount] != -1) return dp[amount]; 

        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = dfs(coins, amount - coin);
            if (res != Integer.MAX_VALUE) { 
                minCoins = Math.min(minCoins, res + 1);
            }
        }

        return dp[amount] = minCoins;
    }
}
