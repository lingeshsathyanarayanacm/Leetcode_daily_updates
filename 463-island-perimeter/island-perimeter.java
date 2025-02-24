class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int p=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]==1){
                   p+=dfs(grid,i,j);
                }
            }
        }
        return p;
    }
    public int dfs(int grid[][],int i,int j)
    {
        int rows=grid.length;
        int cols=grid[0].length;
        int c=0;
        if(i<0 || j<0 || i>=rows||j>=cols|| grid[i][j]==0) return 1;
        if(grid[i][j]==-1)
        {
           return 0;
        }
        grid[i][j]=-1;
        c+=dfs(grid,i+1,j);
        c+=dfs(grid,i-1,j);
        c+=dfs(grid,i,j+1);
        c+=dfs(grid,i,j-1);
        return c;

    }
}