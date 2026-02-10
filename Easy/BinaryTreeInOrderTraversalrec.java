package Easy;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class BinaryTreeInOrderTraversalrec {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
      }
 }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
        
    }
    public void helper(TreeNode root, List<Integer> res){
        if(root != null){
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }
}
