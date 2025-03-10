import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        Arrays.stream(board).forEach(row -> Arrays.fill(row, '.'));

        // HashSets to track occupied columns and diagonals
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonal1 = new HashSet<>(); // row - col
        Set<Integer> diagonal2 = new HashSet<>(); // row + col

        // Start DFS
        dfs(0, n, board, result, cols, diagonal1, diagonal2);
        return result;
    }

    private void dfs(int row, int n, char[][] board, List<List<String>> result,
                     Set<Integer> cols, Set<Integer> diagonal1, Set<Integer> diagonal2) {
        if (row == n) { // Base case: all queens are placed
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || diagonal1.contains(row - col) || diagonal2.contains(row + col)) {
                continue; // Skip invalid positions
            }

            // Place the queen
            board[row][col] = 'Q';
            cols.add(col);
            diagonal1.add(row - col);
            diagonal2.add(row + col);

            // Recurse to the next row
            dfs(row + 1, n, board, result, cols, diagonal1, diagonal2);

            // Backtrack: Remove the queen
            board[row][col] = '.';
            cols.remove(col);
            diagonal1.remove(row - col);
            diagonal2.remove(row + col);
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }
}