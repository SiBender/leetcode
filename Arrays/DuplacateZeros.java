class Solution {
    public void duplicateZeros(int[] arr) {
        int[] tmp = new int[arr.length];
        for(int i = 0, count = 0; i + count < tmp.length ; i++) {
            tmp[i + count] = arr[i];
            if (arr[i] == 0) {
                count++;
            }
        }
        
        for(int i = 0; i < arr.length ; i++) {
            arr[i] = tmp[i];
        }
    }
}
