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
    private List<Integer> al=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traverse(root);
        return al;
    }
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        traverse(root.right);
        al.add(root.val);
    }
}