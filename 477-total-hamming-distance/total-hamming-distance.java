class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length-2;i++)
        {
            for(int j=i+1;j<=nums.length-1;j++)
            {
                sum=sum + Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return sum;
        
    }
  
}