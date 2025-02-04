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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> cse=new ArrayList<>();
        path(root,0,targetSum,cse,new ArrayList<>());
        return cse;
    }
    public void path(TreeNode root,int sum,int targetSum,List<List<Integer>>cse,List<Integer>current)
    {
        if(root==null)
        {
            return ;
        }
        sum=sum+root.val;
        current.add(root.val);
        if(root.left==null && root.right==null && sum==targetSum)
        {
            cse.add(new ArrayList<>(current));  
        }
        else
        {
             path(root.left,sum,targetSum,cse,current);
             path(root.right,sum,targetSum,cse,current);
        }
        current.remove(current.size()-1);

         
    }
}