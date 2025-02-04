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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathsum(root,0,targetSum);
    }
    public boolean pathsum(TreeNode root,int sum,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            sum=sum+root.val;
            if(sum==targetSum)
            {
                return true;
            }
        }
        return pathsum(root.left,sum+root.val,targetSum)|| pathsum(root.right,sum+root.val,targetSum);
    }
}