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
    public List<TreeNode> generateTrees(int n) {
        return generatepath(1,n);
    }
    public List<TreeNode> generatepath(int s,int e)
    {
        List<TreeNode> res=new LinkedList<>();
        if (s > e) {
		 res.add(null); 
		 return res;
	    }

        for(int i=s;i<=e;i++)
        {
            List<TreeNode> leftgenerate=generatepath(s,i-1);
            List<TreeNode> rightgenerate=generatepath(i+1,e);
        
            for(TreeNode left:leftgenerate)
            {
                for(TreeNode right:rightgenerate)
                {
                     TreeNode root=new TreeNode(i);
                     root.left=left;
                     root.right=right;
                     res.add(root);

                }
            }
        }
        return res;
    }
}