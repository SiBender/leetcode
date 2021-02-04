class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (getNumLengh(n) % 2 == 0) { 
                count++;
            }
        }
        return count;
    }
    
    private int getNumLengh(int num) {
        int len = 0;
        while (num > 0) {
            len++;
            num /= 10;
        }
        return len;
    }
}
