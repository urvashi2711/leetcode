class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] result={-1,-1};
        if(nums.length==0 || nums==null){
            return result;
        }
        result[0]=firstpos(nums,target);
        result[1]=endpos(nums,target);
        return result;
    }
    public int firstpos(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int start=-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                start=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return start;
    }
     public int endpos(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int end=-1;
       
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                end=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return end;
}
}