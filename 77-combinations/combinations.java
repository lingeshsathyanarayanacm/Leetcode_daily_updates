class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> cse=new ArrayList<>();
        backtrack(cse,n,k,new ArrayList<>(),1);
        return cse;
    }
    public void backtrack(List<List<Integer>> cse,int n,int k,List<Integer>current,int start)
    {
        if(current.size()==k)
        {
            cse.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            current.add(i);
            backtrack(cse,n,k,current,i+1);
            current.remove(current.size()-1);
        }
    }
}