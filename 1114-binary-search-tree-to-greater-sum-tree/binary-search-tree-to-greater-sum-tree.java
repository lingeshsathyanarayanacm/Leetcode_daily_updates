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
    public TreeNode bstToGst(TreeNode root) {
        sumOfGreaterNodes(root);
        return root;
    }
    int greaterNodesSum = 0;
    public void sumOfGreaterNodes(TreeNode root){
        if(root == null)
            return;
        sumOfGreaterNodes(root.right);
        greaterNodesSum += root.val;
        root.val = greaterNodesSum;
        sumOfGreaterNodes(root.left);
    }
}