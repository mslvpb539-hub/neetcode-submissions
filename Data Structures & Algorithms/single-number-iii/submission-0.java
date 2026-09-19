public class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                res.add(nums[i]);
                if (res.size() == 2) {
                    break;
                }
            }
        }

        return new int[] {res.get(0), res.get(1)};
    }
}