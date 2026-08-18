class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        // int[] newArrayElements = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(val != nums[i]){
                nums[count]=nums[i];
                 count++;
                 }
        }
        return count;
    }
}