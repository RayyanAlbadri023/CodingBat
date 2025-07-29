public boolean isEverywhere(int[] nums, int val) {
    for (int r = 0; r < nums.length - 1; r++) {
        if (nums[r] != val && nums[r + 1] != val) {
            return false;
        }
    }
    return true;
}
