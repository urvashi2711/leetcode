class Solution {
    List<List<Integer>> ans = new ArrayList();
    public void backtrack(int first, ArrayList<Integer> cur, int[] nums,int k){
        if(cur.size()>k) return;
        if(cur.size()==k) {
            ans.add(new ArrayList(cur));
            return;
        }
        for(int i=first;i<nums.length;i++){
            cur.add(nums[i]);
            backtrack(i+1,cur,nums,k);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        for(int k=0;k<=nums.length;k++){
            backtrack(0,new ArrayList<Integer>(),nums,k);
        }
        return ans;
    }
}