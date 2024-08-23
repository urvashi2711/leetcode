class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needmore = target-nums[i];
            if(hash.containsKey(needmore)){
                return new int[] {i,hash.get(needmore)};
            }
            hash.put(nums[i],i);
        }
        return new int[] {};
    }
}
// Build the hash table
//         for (int i = 0; i < n; i++) {
//             numMap.put(nums[i], i);
//         }

//         // Find the complement
//         for (int i = 0; i < n; i++) {
//             int complement = target - nums[i];
//             if (numMap.containsKey(complement) && numMap.get(complement) != i) {
//                 return new int[]{i, numMap.get(complement)};
//             }
//         }

//         return new int[]{}; // No solution found