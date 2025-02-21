class Solution {
    public void solve(int[] nums, int target, int[] count, int sum, int index) {
        if (index == nums.length) {
            if (sum == target) count[0]++;
            return;
        }
        solve(nums, target, count, sum + nums[index], index + 1);
        solve(nums, target, count, sum - nums[index], index + 1);
    }

    public int findTargetSumWays(int[] nums, int target) {
        int[] count = {0}; 
        solve(nums, target, count, 0, 0);
        return count[0];
    }
}
