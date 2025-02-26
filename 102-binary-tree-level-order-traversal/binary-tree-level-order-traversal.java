import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, 0, root);
        return result;
    }

    private void dfs(List<List<Integer>> r, int depth, TreeNode root) {
        if (root == null) {
            return;
        }

        if (r.size() == depth) {
            r.add(new ArrayList<>());
        }

        r.get(depth).add(root.val);

        dfs(r, depth + 1, root.left);
        dfs(r, depth + 1, root.right);
    }
}
