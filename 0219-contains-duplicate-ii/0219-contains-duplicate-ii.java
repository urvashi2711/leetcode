class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         Set<Integer> setss = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) setss.remove(nums[i-k-1]);
            if(!setss.add(nums[i])) return true;
        }
        return false;
    }
}