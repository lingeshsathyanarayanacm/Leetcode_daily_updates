class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> cse=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),cse);
        return cse;
    }
    private static void backtrack(int candidates[],int target,int start,List<Integer>current,List<List<Integer>>cse)
    {
        if(target==0)
        {
            cse.add(new ArrayList<>(current));
        }
        if(target<0)
        {
            return;
        }
        for(int i=start;i<candidates.length;i++){
            current.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i,current,cse);
            current.remove(current.size()-1);
        }
    }
}