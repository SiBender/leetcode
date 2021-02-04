class Solution {
    public int[] sortArrayByParity(int[] A) {
        int divisiblePointer = 0;
        int nonDidvisiblePointer = A.length - 1;
        int tmp = 0;
        while(divisiblePointer < nonDidvisiblePointer) {
            if(A[divisiblePointer] % 2 == 0) {
                divisiblePointer++;
            } else if (A[nonDidvisiblePointer] % 2 == 1) {
                nonDidvisiblePointer--;
            } else {
                tmp = A[divisiblePointer];
                A[divisiblePointer] = A[nonDidvisiblePointer];
                A[nonDidvisiblePointer] = tmp;
            }
        }
        return A;
    }
}
