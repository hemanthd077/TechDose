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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        sumfinder(root);
        return max;
    }
    int sumfinder(TreeNode root){
        if(root == null)
            return 0;
        int leftsum = Math.max(sumfinder(root.left),0);
        int rightsum = Math.max(sumfinder(root.right),0);
        max = Math.max(max,(leftsum+rightsum+root.val));
        return (Math.max(leftsum,rightsum)+root.val);
    }
}