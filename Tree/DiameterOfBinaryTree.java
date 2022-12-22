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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
    }
    int height(TreeNode root){
        if(root == null)
            return 0;
        int ln = height(root.left);
        int rn = height(root.right);
        d = Math.max(d,ln+rn);
        return Math.max(ln,rn)+1;
    }
}