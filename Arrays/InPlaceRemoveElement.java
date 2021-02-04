class Solution {
    public int removeElement(int[] nums, int val) {
        int newLen = nums.length;
        int left = 0, right = nums.length - 1;
        for (int i = 0; i < newLen; i++) {
            if (nums[i] == val) {
                
                while(right > 0 && nums[right] == val && i < right) {
                    newLen--;
                    right--;
                }
                
                nums[i] = nums[right];
                newLen--;
                right--;
            }
        }
        return newLen;
    }   
}
