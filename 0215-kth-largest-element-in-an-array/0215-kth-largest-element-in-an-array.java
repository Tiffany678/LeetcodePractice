class Solution {
    public int findKthLargest(int[] nums, int k) {

        // create PriorityQueue to store elements from nums, so elements can be stored in ascending order in PriorityQueue
        Queue<Integer> q = new PriorityQueue();

        for(int i=0;i<k;i++){
            q.add(nums[i]);
        }
        for(int i = k;i<nums.length;i++){
            if(nums[i]>q.peek()){
                q.poll();
                q.add(nums[i]);
            }
        }
        return q.peek();

    }
}