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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return arr;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0;
            for(int i=0;i<n;i++){
                TreeNode r = q.poll();
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right != null){
                    q.add(r.right);
                }
                sum +=r.val;
            }
            arr.add(sum/n);
        }
        return arr;
    }
}
