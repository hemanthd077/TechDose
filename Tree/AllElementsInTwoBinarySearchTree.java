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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l = new ArrayList<>();
        preorder(root1,l);
        preorder(root2,l);
        Collections.sort(l);
        return l;
    }
    void preorder(TreeNode root, List<Integer> l){
         if(root == null)
            return;
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);
     }
}