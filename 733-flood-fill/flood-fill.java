class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o=image[sr][sc];
        if(o!=color)
        {
            dfs(image,sr,sc,o,color);
        }
        return image;
    }

    public void dfs(int [][]image,int i,int j,int o,int color)
    {
            int rows=image.length;
            int cols=image[0].length;
            
            if(i<0 || j<0 || i>=rows || j>=cols || image[i][j]!=o)return;
            image[i][j]=color;
            dfs(image,i+1,j,o,color);
            dfs(image,i-1,j,o,color);
            dfs(image,i,j+1,o,color);
            dfs(image,i,j-1,o,color);     
    }
}
