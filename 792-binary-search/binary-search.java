class Solution {
    public int search(int[] nums, int target) {
        int k=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                k=i;
            }
        }
        return k;
    }
}