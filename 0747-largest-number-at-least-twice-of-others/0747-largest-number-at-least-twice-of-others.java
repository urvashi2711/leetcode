class Solution {
    public int dominantIndex(int[] nums) {
       int max=-1,secmax=-1,index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secmax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>secmax){
                secmax=nums[i];
            }
        }
        return secmax*2<=max?index:-1;
    }
}