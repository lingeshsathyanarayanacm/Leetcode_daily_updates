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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        dfs(root,result,0);
        return result;
    }
    public void dfs(TreeNode root,List<Integer>result,int depth)
    {
        if(root==null)return;
        if(depth==result.size())
        {
            result.add(root.val);
        }
        else
        {
            result.set(depth,Math.max(result.get(depth),root.val));
        }
        dfs(root.left,result,depth+1);
        dfs(root.right,result,depth+1);
    }
}