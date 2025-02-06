class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> cse=new ArrayList<>();
       backtrack(0,cse,nums.length,nums);
       return cse;
    }
    public void backtrack(int start,List<List<Integer>>cse,int n,int nums[])
    {
        if(start==n)
        {
            List<Integer>current=new ArrayList<>();
            for (int num:nums) {
                current.add(num);
            }
            cse.add(current);
            return;
        }
        for(int i=start;i<n;i++)
        {
            swap(start,i,nums);
            backtrack(start+1,cse,n,nums);
            swap(start,i,nums);
        }
    }
    public void swap(int i,int j,int nums[])
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}