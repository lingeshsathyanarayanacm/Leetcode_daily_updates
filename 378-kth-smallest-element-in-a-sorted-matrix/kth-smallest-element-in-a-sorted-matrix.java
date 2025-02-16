class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer>cse=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                cse.add(matrix[i][j]);
            }
        }
        Collections.sort(cse);
        return cse.get(k-1);
    }
}