class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using HashMap to store the difference value between target and each element in the array, and their associated indexs
        Map<Integer, Integer> numsMap = new HashMap<>();
        int n = nums.length;

        for (int i=0; i<n; i++){
            int complement = target - nums[i];
            
            if(numsMap.containsKey(complement)){
            // If the difference value is exiting in the numsMap, return their associated indexs.
                return new int[]{numsMap.get(complement), i};
            }
            // If the difference value is not in the numsMaps, store the difference and the current index, and continue iteration.
            numsMap.put(nums[i],i);
        }
        return new int[]{};
    }
}