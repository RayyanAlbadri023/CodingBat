public boolean lucky13(int[] nums) {
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 1 || nums[r] == 3) {
            return false;
        }
    }
    return true;
}
