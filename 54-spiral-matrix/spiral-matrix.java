import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> cse = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        dfs(matrix, 0, 0, rows, cols, cse, visited, 0);

        return cse;
    }

    public void dfs(int[][] matrix, int i, int j, int rows, int cols, List<Integer> cse, boolean[][] visited, int dir) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j]) return;
        cse.add(matrix[i][j]);
        visited[i][j] = true;

        int[] dr = {0, 1, 0, -1}; 
        int[] dc = {1, 0, -1, 0}; 

        int ni = i + dr[dir];
        int nj = j + dc[dir];

        if (ni >= 0 && nj >= 0 && ni < rows && nj < cols && !visited[ni][nj]) {
            dfs(matrix, ni, nj, rows, cols, cse, visited, dir);
        } else {
            dir = (dir + 1) % 4;
            dfs(matrix, i + dr[dir], j + dc[dir], rows, cols, cse, visited, dir);
        }
    }
}
