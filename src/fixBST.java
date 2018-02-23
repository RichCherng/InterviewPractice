public class recoverTree{
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        
        if(root.left != null) recoverTree(root.left);
        
        // if(prev == null) prev = root;
        
        if(prev.val > root.val) {
            int temp = prev.val;
            prev.val = root.val;
            root.val = temp;
        }
        prev = root;
        
        if(root.right != null) recoverTree(root.right);
    }
    
   }
