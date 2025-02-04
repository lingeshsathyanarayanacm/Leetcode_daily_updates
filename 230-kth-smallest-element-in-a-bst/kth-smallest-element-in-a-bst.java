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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>cse=new ArrayList<>();
        inorder(root,cse);
        return cse.get(k-1);

    }
    public void inorder(TreeNode root,List<Integer>cse)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left,cse);
        cse.add(root.val);
        inorder(root.right,cse);
    }
}