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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> al=new ArrayList<>();
        if(root==null) return al;
        if(root.left==null && root.right==null) {
            al.add(root.val+"");
            return al;
        }
        for(String path: binaryTreePaths(root.left)){
            al.add(root.val+ "->"+ path);
        }
        for(String path: binaryTreePaths(root.right)){
            al.add(root.val+"->"+path);
        }
        return al;
    }
}
 
        