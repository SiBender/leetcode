//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3270/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
        	int currentValue = nums[i];
        	while(currentValue != nums[currentValue - 1]) {
        		int newPos = currentValue - 1;
                int tmpValue = nums[newPos];
                nums[newPos] = currentValue;
                currentValue = tmpValue;
        	}
        }
        
        return buildAnswer(nums);
    }
    
    private List<Integer> buildAnswer(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                output.add(i+1);
            }
        }
        return output;
    }
}
