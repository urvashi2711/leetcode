class Solution {
    public int singleNumber(int[] nums) {
         for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int cnt = 0;
            for(int j=0;j<nums.length;j++){
                if(num==nums[j]){
                    cnt++;
                }
            }
            if(cnt==1) return num;
        }
        return 0;
    }
}