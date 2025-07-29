public boolean has271(int[] nums) {
    for (int r = 0; r < nums.length - 2; r++) {
        int val = nums[r];
        if (nums[r+1] == val + 5 && Math.abs(nums[r+2] - (val - 1)) <= 2) {
            return true;
        }
    }
    return false;
}
