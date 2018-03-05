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
    
    public TreeNode invertTree(TreeNode root){
        
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root;
    }
//     public TreeNode invertTree(TreeNode root) {
     
//         // BFS
//         Queue<TreeNode> que = new LinkedList<TreeNode>();

//         TreeNode n = root;
//         que.add(root);
        
//         while(n != null && !que.isEmpty()){
//             n = que.remove();
//             if(n == null) continue;
            
//             // System.out.println(n.val);
//             if(n.right != null) que.add(n.right);
//             if(n.left != null) que.add(n.left);
            
//             TreeNode temp = n.right;
//             n.right = n.left;
//             n.left = temp;
//         }
        
//         return root;
//     }
}
