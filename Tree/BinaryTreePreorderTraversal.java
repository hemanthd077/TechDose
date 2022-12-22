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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> l = new LinkedList<>();
        if(root==null)
            return l;
        s.push(root);
        while(!s.isEmpty()){
            root = s.pop();
            l.add(root.val);
            if(root.right != null)
                s.push(root.right);
            if(root.left != null)
                s.push(root.left);
        }
        return l;
    }
}