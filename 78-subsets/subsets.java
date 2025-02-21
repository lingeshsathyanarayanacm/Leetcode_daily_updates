class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> cse=new ArrayList<>();
        backtrack(cse,nums.length,new ArrayList<>(),0,nums);
        return cse;
    }
    public void backtrack(List<List<Integer>> cse,int n,List<Integer> current,int start,int nums[])
    {
        cse.add(new ArrayList<>(current));
        for(int i=start;i<n;i++)
        {
            current.add(nums[i]);
            backtrack(cse,n,current,i+1,nums);
            current.remove(current.size()-1);
        }
    }
}