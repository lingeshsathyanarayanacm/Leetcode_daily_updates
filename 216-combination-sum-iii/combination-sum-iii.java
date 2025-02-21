class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> cse=new ArrayList<>();
        backtrack(k,n,cse,new ArrayList<>(),1,0);
        return cse;
    }
    public void backtrack(int k,int n,List<List<Integer>> cse,List<Integer> current,int start,int sum)
    {
        if(current.size()==k)
        {
            if(sum==n)
            {
                cse.add(new ArrayList<>(current));
            }
            return;
        }
        for(int i=start;i<=9;i++)
        {
            if (sum+i>n) break;
            current.add(i);
            backtrack(k,n,cse,current,i+1,sum+i);
            current.remove(current.size()-1);
        }
    }
}