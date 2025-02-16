class Solution {
    public int numIslands(char[][] grid) {
       int count=0;
       int rows=grid.length;
       int cols=grid[0].length;
       for(int i=0;i<rows;i++)
       {
          for(int j=0;j<cols;j++)
          {
              if(grid[i][j]=='1')
              {
                   count++;
                   dfs(grid,i,j);
              }
          }
       }
       return count;
    }
    public void dfs(char grid[][],int i,int j)
    {
       int rows=grid.length;
       int cols=grid[0].length;
       if(i<0|| j<0|| j>=cols|| i>=rows|| grid[i][j]=='0')return;
       grid[i][j]='0';
       dfs(grid,i+1,j);
       dfs(grid,i-1,j);
       dfs(grid,i,j+1);
       dfs(grid,i,j-1);
        
    }
}