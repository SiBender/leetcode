//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3574/
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int resultPos = result.length - 1;
        while(left < right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare < rightSquare) {
                result[resultPos] = rightSquare;
                right--;
            } else {
                result[resultPos] = leftSquare;
                left++;
            }
            resultPos--;
        }
        result[0] = nums[left] * nums[left];
        return result;
    }
}
