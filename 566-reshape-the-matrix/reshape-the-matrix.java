class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> cse=new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                cse.add(mat[i][j]);
            }
        }
        if (mat.length*mat[0].length!=r*c) return mat; 
        int new1[][]=new int [r][c];
        int index=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                new1[i][j]=cse.get(index++);
            }
        }
        return new1;
        
    }
}