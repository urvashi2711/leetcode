class Solution {
    public boolean check(int[] nums) {
        int spike=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) spike++;
        }
        if(nums[nums.length-1]>nums[0]) spike++;
        if(spike>1) return false;
        return true;
    }
}