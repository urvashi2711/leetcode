class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int last = height.length-1;
        int maxArea = 0;
        while(start<last){
            int currentArea = Math.min(height[start], height[last]) * (last - start);
            maxArea = Math.max(maxArea, currentArea);

            if (height[start] < height[last]) {
                start++;
            } else {
                last--;
            }
        }

        return maxArea;
        }
    
}