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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        if(root == null)
            return l;
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode r = s1.pop();
            if(r.left != null)
                s1.push(r.left);
            if(r.right != null)
                s1.push(r.right);
            l.add(0,r.val);
        }
        return l;
    }
}
