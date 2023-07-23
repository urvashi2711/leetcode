class Solution {
    public int threeSumClosest(int[] nums, int target) {
       var closest=0;
        var mindiff=Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    j++;
                }
                else k--;
            int diff=Math.abs(target-sum);
            if(diff<mindiff){
            mindiff=diff;
            closest=sum;
            }
        }
        
       }
      return closest;     
    }
}