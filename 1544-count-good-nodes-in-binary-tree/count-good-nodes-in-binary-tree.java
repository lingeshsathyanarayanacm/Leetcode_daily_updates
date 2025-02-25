/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);
    }

    private int countGoodNodes(TreeNode root, int maxSoFar) {
        if (root == null) return 0;
        int count = root.val >= maxSoFar ? 1 : 0;
        maxSoFar = Math.max(maxSoFar, root.val);
        return count + countGoodNodes(root.left, maxSoFar) + countGoodNodes(root.right, maxSoFar);
    }
}
