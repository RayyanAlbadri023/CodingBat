public boolean has77(int[] nums) {
    for (int r = 0; r < nums.length - 1; r++) {
        if (nums[r] == 7 && nums[r + 1] == 7) {
            return true;
        }
    }
    for (int r = 0; r < nums.length - 2; r++) {
        if (nums[r] == 7 && nums[r + 2] == 7) {
            return true;
        }
    }
    return false;
}
