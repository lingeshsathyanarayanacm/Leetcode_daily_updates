class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> cse=new ArrayList<>();
        dfs(0,0,"",n,cse);
        return cse;
    }
    public void dfs(int open,int close ,String str,int n,List<String>cse)
    {
        if(open==close && open+close==n*2)
        {
            cse.add(str);
        }
        if(open<n)
        {
            dfs(open+1,close,str+"(",n,cse);
        }
        if(close<open)
        {
            dfs(open,close+1,str+")",n,cse);
        }
    }  
}