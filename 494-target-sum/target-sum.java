class Solution {
    public void solve(int[] nums, int target, int[] c, int sum, int ind) {
        if (ind==nums.length) {
            if (sum==target) c[0]++;
            return;
        }

        sum=sum+nums[ind];
        solve(nums,target,c,sum,ind+1);
        sum=sum-(2*nums[ind]);
        solve(nums,target,c,sum,ind+1);
    }

    public int findTargetSumWays(int[] nums, int target) {
        int[] c=new int[1]; 
        int s=0;
        solve(nums,target,c,s,0);
        return c[0];
    }
}
