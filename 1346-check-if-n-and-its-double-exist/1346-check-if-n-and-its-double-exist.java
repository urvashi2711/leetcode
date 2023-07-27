class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target=2*arr[i];
            int l=0,h=arr.length-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(arr[mid]==target&&mid!=i){
                    return true;
                }else if(arr[mid]<target){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return false;
    }
}