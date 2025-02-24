class Solution {
    private Integer[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows=obstacleGrid.length, cols=obstacleGrid[0].length;
        if (obstacleGrid[0][0]==1||obstacleGrid[rows-1][cols-1]==1) return 0;
        dp=new Integer[rows][cols]; 
        return dfs(obstacleGrid,0,0,rows,cols);
    }

    private int dfs(int[][] ob,int i,int j,int rows,int cols) {
        if (i>=rows||j>=cols||ob[i][j]==1) return 0;
        if (i==rows-1&&j==cols-1) return 1;
        if (dp[i][j]!=null) return dp[i][j];
        return dp[i][j]=dfs(ob,i+1,j,rows,cols) + dfs(ob, i,j+1,rows,cols);
    }
}
