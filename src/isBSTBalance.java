// https://leetcode.com/problems/balanced-binary-tree/description/


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
    public boolean isBalanced(TreeNode root) {
        
        return balance(root) >= 0;
    }
    
    // -1 mean out of balance
    public int balance(TreeNode root){
        if(root == null) return 0;
        
        int right = balance(root.right);
        int left = balance(root.left);
        if(right == -1 || left == -1 || Math.abs(right - left) > 1) return -1;
        return 1 + Math.max(right, left);
        
    }
    
}
