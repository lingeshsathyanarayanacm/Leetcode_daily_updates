import java.util.HashMap;
import java.util.Map;

class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; 
        
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }
        
        return dp[amount];
    }
}
