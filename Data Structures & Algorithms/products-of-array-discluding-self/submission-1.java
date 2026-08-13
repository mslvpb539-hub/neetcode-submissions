class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prx = 1;
        for(int i=0;i<n;i++){
            result[i]= prx;
            prx *= nums[i];
        }

        int sufx = 1;
        for(int i=n-1;i>= 0;i--){
            result[i] *= sufx;
            sufx *= nums[i];
        }
      return result;
    }
}  
