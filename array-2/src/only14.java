public boolean only14(int[] nums) {
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] != 1 && nums[r] != 4) {
            return false;
        }
    }
    return true;
}
