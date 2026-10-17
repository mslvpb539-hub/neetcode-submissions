public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] output = new int[n];

        // 1. Build the prefix product array (left to right)
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        // 2. Build the suffix product array (right to left)
        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }

        // 3. Assemble the output array using values except self
        for (int i = 0; i < n; i++) {
            int leftProduct = (i == 0) ? 1 : prefix[i - 1];
            int rightProduct = (i == n - 1) ? 1 : suffix[i + 1];
            
            output[i] = leftProduct * rightProduct;
        }

        return output;
    }

    
}
