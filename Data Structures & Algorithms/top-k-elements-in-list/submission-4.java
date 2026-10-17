public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int element : nums) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        keys.sort((a, b) -> countMap.get(b) - countMap.get(a));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = keys.get(i);
        }
        return res;
    }
}
