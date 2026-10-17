class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.add(n);
            int len = pq.size();
            if(pq.size() > k){
                pq.poll();
            }

        }
      return pq.peek();
    }
}
