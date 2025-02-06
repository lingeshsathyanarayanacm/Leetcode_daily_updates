class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> cse=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,nums.length,new ArrayList<>(),cse);
        return cse;
    }
    public void backtrack(int nums[],int start,int n,List<Integer>current,List<List<Integer>> cse)
    {
        if(!cse.contains(current))
        {
            cse.add(new ArrayList<>(current));
        }
        for(int i=start;i<n;i++)
        {
            current.add(nums[i]);
            backtrack(nums,i+1,n,current,cse);
            current.remove(current.size() - 1);
        }
    }
}