class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    perimeter += calculatePerimeter(grid, i, j);
                }
            }
        }
        return perimeter;
    }

    private int calculatePerimeter(int[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0) {
            return 1;  // Water or out of bounds contributes to perimeter
        }
        if (grid[i][j] == -1) {
            return 0; // Already visited
        }

        grid[i][j] = -1; // Mark cell as visited

        // Check all four directions
        count += calculatePerimeter(grid, i + 1, j);
        count += calculatePerimeter(grid, i - 1, j);
        count += calculatePerimeter(grid, i, j + 1);
        count += calculatePerimeter(grid, i, j - 1);

        return count;
    }
}
