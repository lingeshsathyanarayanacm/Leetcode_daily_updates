class Solution {
    private int dp[][];
    public int minPathSum(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        dp=new int[rows][cols];
        for(int row[]:dp)
        {
            Arrays.fill(row,-1);
        }
        return dfs(grid,rows-1,cols-1);
    }
    public int dfs(int grid[][],int i,int j)
    {
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0)return grid[0][0];
        if(dp[i][j]!=-1)return dp[i][j];
        dp[i][j]=grid[i][j]+Math.min(dfs(grid,i-1,j),dfs(grid,i,j-1));
        return dp[i][j];

    }
}