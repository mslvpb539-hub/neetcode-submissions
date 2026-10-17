public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count everything first
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int element : nums) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }
        
        // Step 2: Extract the keys and sort them by their frequency values in descending order
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        keys.sort((a, b) -> countMap.get(b) - countMap.get(a));
        
        // Step 3: Grab the top K elements from the sorted list
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = keys.get(i);
        }
        
        return res;
    }
}
