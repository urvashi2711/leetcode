class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        for(int i=1;i<=nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return 0;
    }
}