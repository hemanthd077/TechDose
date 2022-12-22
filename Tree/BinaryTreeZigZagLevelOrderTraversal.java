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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return res;
        q.offer(root);
        boolean flag =true;
        while(!q.isEmpty()){
            LinkedList<Integer> l = new LinkedList<>();
            int size= q.size();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(!flag)
                    l.addFirst(node.val);
                else
                    l.addLast(node.val);
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
                
            }
            res.add(l);
            flag = !flag;
        }
        return res;
    }
}