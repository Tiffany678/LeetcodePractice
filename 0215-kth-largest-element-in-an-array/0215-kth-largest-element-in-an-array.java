class Solution {
    public int findKthLargest(int[] nums, int k) {

        // create PriorityQueue, pg to store elements from nums array, so elements can be stored in ascending order.
        Queue<Integer> pq = new PriorityQueue();

        // Store K elements of the nums array
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }

        // iterate the remaind elements of array, and compair with the smallest element in pq. If the current element is larger than the pq's smallest element, remove it and add to the pq. so that, the pq can only contain size of k consistenly, and return the first element at the front with peek()
        for(int i = k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll(); 
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}