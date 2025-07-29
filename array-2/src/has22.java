public boolean has22(int[] nums) {
    for (int r = 0; r < nums.length - 1; r++) {
        if (nums[r] == 2 && nums[r + 1] == 2) {
            return true;
        }
    }
    return false;
}
