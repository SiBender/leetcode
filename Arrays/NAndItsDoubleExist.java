class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {continue;}
                    if (arr[i] == arr[j] * 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
