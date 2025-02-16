import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> cse = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[][] visited = new boolean[rows][cols];

        // Start DFS from (0,0) with initial direction as "Right"
        dfs(matrix, 0, 0, rows, cols, cse, visited, 0);

        return cse;
    }

    public void dfs(int[][] matrix, int i, int j, int rows, int cols, List<Integer> cse, boolean[][] visited, int dir) {
        // Boundary conditions
        if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j]) return;

        // Add the current element to the list and mark as visited
        cse.add(matrix[i][j]);
        visited[i][j] = true;

        // Move in Spiral Order: Right → Down → Left → Up
        int[] dr = {0, 1, 0, -1}; // Row movements
        int[] dc = {1, 0, -1, 0}; // Column movements

        // Try moving in the current direction
        int ni = i + dr[dir];
        int nj = j + dc[dir];

        // If the next move is valid, continue in the same direction
        if (ni >= 0 && nj >= 0 && ni < rows && nj < cols && !visited[ni][nj]) {
            dfs(matrix, ni, nj, rows, cols, cse, visited, dir);
        } else {
            // Change direction clockwise and continue
            dir = (dir + 1) % 4;
            dfs(matrix, i + dr[dir], j + dc[dir], rows, cols, cse, visited, dir);
        }
    }
}
