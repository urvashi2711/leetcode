class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s=new HashSet<>();
        List<List<Integer>> output=new ArrayList<>();
        int target=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(target==sum){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                    
                }else k--;
            }
        }
        output.addAll(s);
        return output;
    }
}
  