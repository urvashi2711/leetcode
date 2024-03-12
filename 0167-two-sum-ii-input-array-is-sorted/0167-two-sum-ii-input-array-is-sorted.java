class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int currentSum = numbers[left] + numbers[right];
        while(currentSum!=target){
            if(currentSum>target){
                right--;
            }
            else{
                left++;
            }
            currentSum = numbers[left] + numbers[right];
        }
        return new int[] {++left,++right};
    }
}