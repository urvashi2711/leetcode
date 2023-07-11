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
    public int height(TreeNode root){
        if(root==null){
            return 0;
            
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
            int htL=height(root.left);
            int htR=height(root.right);
            boolean isbalR=(Math.abs(htL-htR)<=1);
            boolean isballeft=isBalanced(root.left);
            boolean isbalright=isBalanced(root.right);
            return isbalR && isballeft && isbalright;
    }
}