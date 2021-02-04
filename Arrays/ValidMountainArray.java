class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean hasClimb = false;
        boolean hasDownhill = false;
        for(int i = 0; i < arr.length - 1; i++) {
            int delta = arr[i+1] - arr[i];
            if(delta == 0) {return false;}
            if(delta > 0) {
                hasClimb = true;
                if (hasDownhill == true) {return false;}
            }
            if(delta < 0) {
                hasDownhill = true;
                if (hasClimb == false) {return false;}
            }
        }
        return hasClimb && hasDownhill;
    }
}
