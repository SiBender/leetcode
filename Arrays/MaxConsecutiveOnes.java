class Solution {
    private int[] topNums;
    private int currentLen;
    
    public int findMaxConsecutiveOnes(int[] nums) {
        topNums = new int[3];
        topNums[0] = nums[0];
        currentLen = 0;
        
        for (int i : nums) {
            for(j = 0; j < currentLen; j++) {
                if (i == topNums[j]) { break; }
                if (i > topNums[j]) {
                    insert(i, j);
                }
            }
            if (currentLen < 3) {
                insert(i, currentLen);
            }
        }   
        return (maxLen >= currentLen) ? maxLen : currentLen;
    }
    
    private insert(int n, int pos) {
        currentLen = (currentLen + 1 > 3) ? 3 : currentLen++;
        
        for(int i = pos; i < currentLen; i++) {
            int tmp = topNums[i];
            topNums[i] = n;
            n = tmp;            
        }
    }
}
