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
    private int maxd=0;
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int depth=0;
        findDepth(root,depth);
        return 1+maxd;
    }
    public void findDepth(TreeNode root,int depth)
    {
        if(root==null)
        {
            return ;
        }
        maxd=Math.max(maxd,depth);
        findDepth(root.left,depth+1);
        findDepth(root.right,depth+1);
    }
}