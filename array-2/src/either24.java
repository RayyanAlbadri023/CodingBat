public boolean either24(int[] nums) {
    boolean has22 = false;
    boolean has44 = false;
    for (int r = 0; r < nums.length - 1; r++) {
        if (nums[r] == 2 && nums[r + 1] == 2) {
            has22 = true;
        }
        if (nums[r] == 4 && nums[r + 1] == 4) {
            has44 = true;
        }
    }
    return has22 ^ has44;
}
