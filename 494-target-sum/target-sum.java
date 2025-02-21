class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,target,0,0,nums.length);
    }
    public int backtrack(int nums[],int target,int start,int sum,int n)
    {
        if(start==nums.length)
        {
            return sum==target?1:0;
        }
       int add=backtrack(nums,target,start+1,sum+nums[start],n);
       int sub=backtrack(nums,target,start+1,sum-nums[start],n);
       return add+sub;
    }
}  