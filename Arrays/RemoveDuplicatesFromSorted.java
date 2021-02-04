class Solution {
    public int removeDuplicates(int[] nums) {
        int newLen = nums.length;
        int currentUnique = (nums.length > 0) ? nums[0] : 0;
        for(int i = 1, pointer = 0 ; i < nums.length; i++) {
            if (nums[i] != currentUnique) {
                pointer++;
                currentUnique = nums[i];
                nums[pointer] = nums[i];
            } else {
               newLen--; 
            }
        }
        return newLen;
    }
}
