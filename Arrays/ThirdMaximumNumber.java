//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3231/
class Solution {
    private int[] topNums;
    private int currentLen;
    
    public int thirdMax(int[] nums) {
        topNums = new int[3];
        topNums[0] = nums[0];
        currentLen = 1;
        
        for (int i : nums) {
            parse(i);
        }   
        return (currentLen == 3) ?  topNums[2] : topNums[0];
    }
    
    private void parse(int num) {
		for(int j = 0; j < currentLen; j++) {
            if (num == topNums[j]) { 
                return; 
            }
            if (num > topNums[j]) {
                insert(num, j);
                return;
            }
        }
		
        if (currentLen < 3) {
            insert(num, currentLen);
        }
	}
	
	private void insert(int n, int pos) {
        currentLen = (currentLen == 3) ? 3 : currentLen + 1;
        
        for(int i = pos; i < currentLen; i++) {
            int tmp = topNums[i];
            topNums[i] = n;
            n = tmp;            
        }
    }
}
