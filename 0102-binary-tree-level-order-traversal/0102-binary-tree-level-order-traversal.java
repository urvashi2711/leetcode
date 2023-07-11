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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al= new ArrayList<List<Integer>>();
        traverse(al,root,0);
        return al;
    }
    public void  traverse(List<List<Integer>> al,TreeNode root,int height){
        if(root==null){
            return;
        
        }
        if(height==al.size()){
            al.add(new LinkedList<Integer>());
        }
        al.get(height).add(root.val);
        traverse(al,root.left,height+1);
         traverse(al,root.right,height+1);
    }
}
