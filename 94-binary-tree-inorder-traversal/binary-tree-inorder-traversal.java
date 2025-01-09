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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> cse=new ArrayList<>();
        inorder(root,cse);
        return cse;
    }
    private void inorder(TreeNode node,List <Integer> cse)
    {
        if(node==null) return;
        inorder(node.left,cse);
        cse.add(node.val);
        inorder(node.right,cse);
    }
}