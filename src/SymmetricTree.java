/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
       return root == null || helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null || right == null){
            //if one of them is null, check if both of them is null;
            return left == right;
        }
        
        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
    }
}
