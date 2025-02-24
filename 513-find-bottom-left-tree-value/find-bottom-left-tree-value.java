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
    public int findBottomLeftValue(TreeNode root) {
       List<Integer>result=new ArrayList<Integer>();
       bottom(root,result,0);
       int n=result.size();
       return result.get(n-1);
    }
    public void bottom(TreeNode curr,List<Integer>result,int depth)
    {
        if(curr==null)return;
        if(result.size()==depth)
        {
            result.add(curr.val);
        }
        bottom(curr.left,result,depth+1);
        bottom(curr.right,result,depth+1);
    }
}