class Solution {
    private int dp[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        dp=new int[rows][cols];
        if(obstacleGrid[0][0]==1 || obstacleGrid[rows-1][cols-1]==1)return 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dp[i][j] = -1;
            }
        }
        return dfs(obstacleGrid,0,0,rows,cols);

    }
    public int dfs(int ob[][],int i,int j,int rows,int cols)
    {
        if(i>=rows||j>=cols||ob[i][j]==1)return 0;
        if(i==rows-1 && j==cols-1) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]=dfs(ob,i+1,j,rows,cols)+dfs(ob,i,j+1,rows,cols);
        return dp[i][j];
    }
}
